package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.ArticleAttachConstant;
import com.jichuangtech.nbadataserver.constant.ArticleConstant;
import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.model.ArticleAttachEntity;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.vo.ArticleAttachRespVo;
import com.jichuangtech.nbadataserver.model.vo.ArticleRespVo;
import com.jichuangtech.nbadataserver.repository.ArticleAttachRepository;
import com.jichuangtech.nbadataserver.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ArticleAttachConstant.API_ARTICLE_ATTACH)
public class ArticleAttachController extends BaseController {
    private static final String TAG = ArticleAttachController.class.getSimpleName();

    @Autowired
    private ArticleAttachRepository mArticleAttachRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Response<List<ArticleAttachRespVo>> list() {
        Response<List<ArticleAttachRespVo>> response = new Response<>();

        response.data = mapList(mArticleAttachRepository.findAll(), ArticleAttachRespVo.class);
        LOGGER.info(" list vo: " + response.data);
        if (response.data == null) {
            response.setStatusCode(ResponseCode.TEAM_NOT_FOUND_CODE);
        }
        return response;
    }
}
