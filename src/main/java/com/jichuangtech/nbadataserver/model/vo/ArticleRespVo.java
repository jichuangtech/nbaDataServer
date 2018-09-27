package com.jichuangtech.nbadataserver.model.vo;

import com.jichuangtech.nbadataserver.model.ArticleAttachEntity;

import java.sql.Timestamp;
import java.util.List;

public class ArticleRespVo {
    private int articleId;
    private String articleTitle;
    private Timestamp articleTime;
    private String articleAuthor;
    private int articleClick;
    private String articleContent;
    private byte isStick;
    private byte isDelete;
    private Integer belongmatch;
    private int categoryId;
    private List<ArticleAttachRespVo> articleAttachList;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Timestamp getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Timestamp articleTime) {
        this.articleTime = articleTime;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public int getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(int articleClick) {
        this.articleClick = articleClick;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public byte getIsStick() {
        return isStick;
    }

    public void setIsStick(byte isStick) {
        this.isStick = isStick;
    }

    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getBelongmatch() {
        return belongmatch;
    }

    public void setBelongmatch(Integer belongmatch) {
        this.belongmatch = belongmatch;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List<ArticleAttachRespVo> getArticleAttachList() {
        return articleAttachList;
    }

    public void setArticleAttachList(List<ArticleAttachRespVo> articleAttachList) {
        this.articleAttachList = articleAttachList;
    }
}
