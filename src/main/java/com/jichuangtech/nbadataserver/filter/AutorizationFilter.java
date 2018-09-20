package com.jichuangtech.nbadataserver.filter;

import com.google.common.collect.Sets;
import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.utils.JsonMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * Created by yangjb on 2017/8/18.
 * 验证身份
 */
@Component("autorizationFilter")
public class AutorizationFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutorizationFilter.class);
    public static final String CLOTH_SHOP_SERVER = "/nbadataserver";
    private final Set<String> filterUri = Sets.newHashSet();
    private static final String PRODUCT_REQUESTURI_PRREF = "/nbadataserver";

//    @Autowired
//    private SessionService sessionService;
    @Value("${is_product}")
    private boolean isProduct;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //不用进行身份验证的URI
        filterUri.add("/");
        filterUri.add("/api/pay/wxNotify"); //微信支付的后，微信服务器的回调信息
        filterUri.add("/login");
        filterUri.add("/onlogin");
        filterUri.add("/configuration/ui");
        filterUri.add("/swagger-resources");
        filterUri.add("/webjars/springfox-swagger-ui/lib/underscore-min.map");
        filterUri.add("/swagger-ui.html");
        filterUri.add("/v2/api-docs");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //解决跨域问题
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization,access_token,Content-Type");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");

        //不是生产环境不开启session验证
        LOGGER.info("isProduct: " + isProduct);
        if (!isProduct) {
            chain.doFilter(request, response);
            return;
        }

        HttpServletRequest req = (HttpServletRequest) request;
        String requestURI = req.getRequestURI();
        String remoteHost = req.getRemoteHost();
        LOGGER.info("requestURI : " + requestURI + ", remoteHost: " + remoteHost);
        if (StringUtils.startsWithIgnoreCase(requestURI, CLOTH_SHOP_SERVER)) {
            requestURI = requestURI.substring(16);
        }
        if (filterUri.contains(requestURI)) {
            chain.doFilter(request, response);
            return;
        }
        //过滤一些静态资源,如果不用swagger可以考虑注释掉
        if (StringUtils.endsWith(requestURI, "js") || StringUtils.endsWith(requestURI, "css")
                || StringUtils.endsWith(requestURI, "html") || StringUtils.endsWith(requestURI, "png")
                || StringUtils.startsWith(requestURI, "/api/info")
                || StringUtils.endsWith(requestURI, "jpg") || StringUtils.endsWith(requestURI, "ttf")) {
            chain.doFilter(request, response);
            return;
        }
        Response resp = new Response();
        String sessionId = req.getHeader("access_token");
        if (sessionId == null) {
            LOGGER.info("sessionId param lost");
            resp.msg = "not found access_token in your headers";
            resp.statusCode = ResponseCode.ACCESS_TOKEN_NOT_FOUND_CODE;
            LOGGER.info(resp.msg);
            response.getWriter().write(JsonMapper.nonDefaultMapper().toJson(resp));
            return;
        }

        //下面代码进行刷新缓存
        // TODO: 2018/4/26
//        String value = sessionService.get(sessionId);
        String value = "";
        LOGGER.info("sessionId : " + sessionId + ", value: " + value);
        if (value != null) {
            chain.doFilter(request, response);
            return;
        }

        resp.msg = "invalid token";
        resp.statusCode = ResponseCode.TOKEN_INVALID_CODE;
        LOGGER.info(resp.msg);
        response.getWriter().write(JsonMapper.nonDefaultMapper().toJson(resp));
    }

    @Override
    public void destroy() {

    }
}
