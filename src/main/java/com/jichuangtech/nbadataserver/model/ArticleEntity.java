package com.jichuangtech.nbadataserver.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_article", schema = "NBADATA", catalog = "")
public class ArticleEntity {
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

    @Id
    @Column(name = "article_id", nullable = false)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "article_title", nullable = false, length = 128)
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    @Basic
    @Column(name = "article_time", nullable = false)
    public Timestamp getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Timestamp articleTime) {
        this.articleTime = articleTime;
    }

    @Basic
    @Column(name = "article_author", nullable = false, length = 30)
    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    @Basic
    @Column(name = "article_click", nullable = false)
    public int getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(int articleClick) {
        this.articleClick = articleClick;
    }

    @Basic
    @Column(name = "article_content", nullable = false, length = -1)
    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Basic
    @Column(name = "is_stick", nullable = false)
    public byte getIsStick() {
        return isStick;
    }

    public void setIsStick(byte isStick) {
        this.isStick = isStick;
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "belongmatch", nullable = true)
    public Integer getBelongmatch() {
        return belongmatch;
    }

    public void setBelongmatch(Integer belongmatch) {
        this.belongmatch = belongmatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleEntity that = (ArticleEntity) o;

        if (articleId != that.articleId) return false;
        if (articleClick != that.articleClick) return false;
        if (isStick != that.isStick) return false;
        if (categoryId != that.categoryId) return false;
        if (isDelete != that.isDelete) return false;
        if (articleTitle != null ? !articleTitle.equals(that.articleTitle) : that.articleTitle != null) return false;
        if (articleTime != null ? !articleTime.equals(that.articleTime) : that.articleTime != null) return false;
        if (articleAuthor != null ? !articleAuthor.equals(that.articleAuthor) : that.articleAuthor != null)
            return false;
        if (articleContent != null ? !articleContent.equals(that.articleContent) : that.articleContent != null)
            return false;
        if (belongmatch != null ? !belongmatch.equals(that.belongmatch) : that.belongmatch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (articleTitle != null ? articleTitle.hashCode() : 0);
        result = 31 * result + (articleTime != null ? articleTime.hashCode() : 0);
        result = 31 * result + (articleAuthor != null ? articleAuthor.hashCode() : 0);
        result = 31 * result + articleClick;
        result = 31 * result + (articleContent != null ? articleContent.hashCode() : 0);
        result = 31 * result + (int) isStick;
        result = 31 * result + (int) isDelete;
        result = 31 * result + categoryId;
        result = 31 * result + (belongmatch != null ? belongmatch.hashCode() : 0);
        return result;
    }
}
