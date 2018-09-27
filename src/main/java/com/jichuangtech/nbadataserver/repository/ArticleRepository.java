package com.jichuangtech.nbadataserver.repository;

import com.jichuangtech.nbadataserver.model.ArticleEntity;
import com.jichuangtech.nbadataserver.model.MatchResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer>{
    ArticleEntity findByArticleId(int id);
}
