package com.jichuangtech.nbadataserver.controller;


import com.jichuangtech.nbadataserver.constant.Constant;
import com.jichuangtech.nbadataserver.constant.InfoConstant;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.utils.PictureUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 进行仅可读性的操作用来GET请求一些公开的数据，不需要进行身份验证例如：
 * （1）图片
 * 等...
 * Created by Bingo on 2017/9/9.
 */
@RestController
@RequestMapping(InfoConstant.API_INFO)
public class InfoController {
    private static Logger LOGGER = LoggerFactory.getLogger(InfoController.class.getSimpleName());

    @RequestMapping(value = InfoConstant.PICTURE + "/{picName:.+}", method = RequestMethod.GET)
    public Response getPicture(HttpServletResponse response, @PathVariable String picName) {
        Response res = new Response();
        res.setStatusCode(PictureUtils.getPicture(response, Constant.SERVER_IMAGE_PATH, picName));
        return res;
    }


}
