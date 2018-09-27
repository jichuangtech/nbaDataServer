package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.ArticleConstant;
import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.constant.TeamConstant;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.vo.ArticleRespVo;
import com.jichuangtech.nbadataserver.model.vo.TeamRespVo;
import com.jichuangtech.nbadataserver.repository.ArticleRepository;
import com.jichuangtech.nbadataserver.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ArticleConstant.API_ARTICLE)
public class ArticleController extends BaseController {
    private static final String TAG = ArticleController.class.getSimpleName();

    @Autowired
    private ArticleRepository mArticleRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Response<List<ArticleRespVo>> list() {
        Response<List<ArticleRespVo>> response = new Response<>();
        
        response.data = mapList(mArticleRepository.findAll(), ArticleRespVo.class);
        LOGGER.info(" list vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.TEAM_NOT_FOUND_CODE);
        }
        return response;
    }

    @RequestMapping(value = "/byBelongMatch", method = RequestMethod.GET)
    public Response<List<ArticleRespVo>> listByBelongMatch(@RequestParam int scheduleId) {
        Response<List<ArticleRespVo>> response = new Response<>();

        response.data = mapList(mArticleRepository.findByBelongmatch(scheduleId), ArticleRespVo.class);
        LOGGER.info(" listByBelongMatch scheduleId: " + scheduleId + ", vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.TEAM_NOT_FOUND_CODE);
        }
        return response;
    }
}
