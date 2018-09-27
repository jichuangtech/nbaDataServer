package com.jichuangtech.nbadataserver.model.vo;

import com.jichuangtech.nbadataserver.model.ArticleEntity;

public class ArticleAttachRespVo {
    private int id;
    private int  articleId;
    private String attachUrl;
    private Byte attachType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl;
    }

    public Byte getAttachType() {
        return attachType;
    }

    public void setAttachType(Byte attachType) {
        this.attachType = attachType;
    }

    @Override
    public String toString() {
        return "ArticleAttachRespVo{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", attachUrl='" + attachUrl + '\'' +
                ", attachType=" + attachType +
                '}';
    }
}
