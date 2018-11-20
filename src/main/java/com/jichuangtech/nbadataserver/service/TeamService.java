package com.jichuangtech.nbadataserver.service;

import com.jichuangtech.nbadataserver.constant.ResponseCode;
import com.jichuangtech.nbadataserver.model.Response;
import com.jichuangtech.nbadataserver.model.TeamInfoEntity;
import com.jichuangtech.nbadataserver.model.vo.TeamRespVo;
import com.jichuangtech.nbadataserver.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class TeamService extends BaseService{

    @Autowired
    private TeamRepository mTeamRepository;

    public TeamInfoEntity lisById(int id) {
        return mTeamRepository.findById(id);
    }

    public List<TeamInfoEntity> findAll() {
        return mTeamRepository.findAll();
    }
}
