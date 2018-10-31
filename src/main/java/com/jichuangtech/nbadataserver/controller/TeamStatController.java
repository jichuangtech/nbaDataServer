package com.jichuangtech.nbadataserver.controller;

import com.jichuangtech.nbadataserver.constant.TeamStatByConstant;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.vo.StatbyteamRespVo;
import com.jichuangtech.nbadataserver.service.TeamStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(TeamStatByConstant.API_TEAM_STAT_BY)
public class TeamStatController extends BaseController {

    {
        TAG = TeamStatController.class.getSimpleName();
    }

    @Autowired
    private TeamStatService mTeamStatService;


    @RequestMapping(value = "/byTeamIdAndSeason", method = RequestMethod.GET)
    public Response<StatbyteamRespVo> showTeamStatBySeason(@RequestParam int teamId, @RequestParam String season, @RequestParam String matchKind) {
        showLog("showTeamStatBySeason teamId: " + teamId
                + ", season: " + season
                + ", matchKind: " + matchKind);
        Response<StatbyteamRespVo> response = getResponse(StatbyteamRespVo.class);

        response.data = mapSingle(mTeamStatService.getTeamStatBySeason(teamId, season, matchKind), StatbyteamRespVo.class);

        return response;
    }


}
