package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.constant.TeamConstant;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.TeamInfoEntity;
import com.jichuangtech.nbadataserver.model.vo.TeamRespVo;
import com.jichuangtech.nbadataserver.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(TeamConstant.API_TEAM)
public class TeamController extends BaseController {
    private static final String TAG = TeamController.class.getSimpleName();

    @Autowired
    private TeamRepository mTeamRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Response<List<TeamRespVo>> list() {
        Response<List<TeamRespVo>> response = new Response<>();
        
        response.data = mapList(mTeamRepository.findAll(), TeamRespVo.class);
        LOGGER.info(" team vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.TEAM_NOT_FOUND_CODE);
        }
        return response;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response<TeamRespVo> lisById(@PathVariable int id) {
        Response<TeamRespVo> response = new Response<>();
        response.data = mapSingle(mTeamRepository.findById(id), TeamRespVo.class);
        LOGGER.info(" team lisById vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.TEAM_NOT_FOUND_CODE);
        }
        return response;
    }
}
