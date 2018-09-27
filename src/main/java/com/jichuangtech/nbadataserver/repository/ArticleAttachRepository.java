package com.jichuangtech.nbadataserver.repository;

import com.jichuangtech.nbadataserver.model.ArticleAttachEntity;
import com.jichuangtech.nbadataserver.model.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleAttachRepository extends JpaRepository<ArticleAttachEntity, Integer>{
    ArticleAttachEntity findById(int id);
}
