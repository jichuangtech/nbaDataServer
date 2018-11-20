package com.jichuangtech.nbadataserver.service;

import com.jichuangtech.nbadataserver.model.MatchResultEntity;
import com.jichuangtech.nbadataserver.model.Page;
import com.jichuangtech.nbadataserver.model.StatbyTeamEntity;
import com.jichuangtech.nbadataserver.model.vo.MatchResultRespVo;
import com.jichuangtech.nbadataserver.repository.MatchResultRepository;
import com.jichuangtech.nbadataserver.repository.TeamStatRepository;
import com.jichuangtech.nbadataserver.utils.PaginationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchResultService extends BaseService{

    {
        TAG = MatchResultService.class.getSimpleName();
    }

    @Autowired
    private MatchResultRepository mMatchResultRepository;

    public List<MatchResultEntity> findByGamedate(String date) {
        return mMatchResultRepository.findByGamedate(date);
    }

    public MatchResultEntity findById(int id) {
        return mMatchResultRepository.findById(id);
    }

    public Page paginate(int teamId, int pageSize, int pageIndex) {
        List<MatchResultEntity> srcData = mMatchResultRepository.findAll();
        Page page = new Page<MatchResultRespVo>();
        PaginationUtils.paginate(page, srcData, pageSize, pageIndex);
        showLog(" paginate teamId: " + teamId
                + ", pageSize: " + pageSize
                + ", pageIndex: " + pageIndex
                + ", page: " + page);
        return page;
    }

    public List<MatchResultEntity> findByTeamId(int teamId) {

        // TODO: 2018/11/15


        return null;
    }

}
