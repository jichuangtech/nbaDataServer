package com.jichuangtech.nbadataserver.repository;

import com.jichuangtech.nbadataserver.model.StatbyTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamStatRepository extends JpaRepository<StatbyTeamEntity, Integer>{
    StatbyTeamEntity findById(int id);
}
