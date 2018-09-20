package com.jichuangtech.nbadataserver.repository;

import com.jichuangtech.nbadataserver.model.MatchResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchResultRepository extends JpaRepository<MatchResultEntity, Integer>{
    MatchResultEntity findById(int id);

    List<MatchResultEntity> findByGamedate(String date);
}
