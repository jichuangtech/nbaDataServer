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
        LOGGER.info(" team vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.TEAM_NOT_FOUND_CODE);
        }
        return response;
    }
}
