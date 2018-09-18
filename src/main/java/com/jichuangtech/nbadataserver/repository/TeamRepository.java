package com.jichuangtech.nbadataserver.repository;

import com.jichuangtech.nbadataserver.model.TeamInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamInfoEntity, Integer>{
    TeamInfoEntity findById(int id);
}
