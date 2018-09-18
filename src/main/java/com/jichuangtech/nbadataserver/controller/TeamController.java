package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.constant.TeamConstant;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.TeamInfoEntity;
import com.jichuangtech.nbadataserver.model.vo.TeamRespVo;
import com.jichuangtech.nbadataserver.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        List<TeamInfoEntity> mTeams = mTeamRepository.findAll();
        LOGGER.info(" team mTeams: " + mTeams);
        Response<List<TeamRespVo>> response = new Response<>();
        
        response.data = mapList(mTeams, TeamRespVo.class);
        LOGGER.info(" team vo: " + response.data);
        if(response.data == null) {
            response.setStatusCode(ResponseCode.CODE_GOODS_GET_ALL_ERROR);
        }
        return response;
    }
}
