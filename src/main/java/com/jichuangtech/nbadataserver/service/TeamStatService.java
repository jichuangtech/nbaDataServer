package com.jichuangtech.nbadataserver.service;

import com.jichuangtech.nbadataserver.model.StatbyTeamEntity;
import com.jichuangtech.nbadataserver.repository.TeamStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamStatService extends BaseService{

    {
        TAG = TeamStatService.class.getSimpleName();
    }

    @Autowired
    private TeamStatRepository mTeamStatRepository;

    @Autowired
    private TeamService mTeamService;

    public List<StatbyTeamEntity> getTeamStatBySeason(int teamId, String season, String matchKind) {

        //（1）实体对象（查询条件值）
        StatbyTeamEntity entity = new StatbyTeamEntity();
        entity.setTeamId(teamId);
        entity.setSeanson(season);
        entity.setMatchkind(matchKind);

        // （2）匹配器（查询方式）
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnorePaths("id");

        //（3）完整的查询条件
        Example<StatbyTeamEntity> example = Example.of(entity, matcher);


        List<StatbyTeamEntity> result = mTeamStatRepository.findAll(example);

        showLog("getTeamStatBySeason teamId: " + teamId
                + ", season: " + season
                + ", matchKind: " + matchKind
                + ", result: " + result);


        return result;
    }
}
