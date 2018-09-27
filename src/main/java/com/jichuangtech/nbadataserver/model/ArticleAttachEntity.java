package com.jichuangtech.nbadataserver.model;

import javax.persistence.*;

@Entity
@Table(name = "t_article_attach", schema = "NBADATA", catalog = "")
public class ArticleAttachEntity {
    private int id;
    private ArticleEntity article;
    private String attachUrl;
    private Byte attachType;


    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "article_id", nullable = false)
    public ArticleEntity getArticle() {
        return article;
    }

    public void setArticle(ArticleEntity article) {
        this.article = article;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attach_url", nullable = false, length = 128)
    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl;
    }

    @Basic
    @Column(name = "attach_type", nullable = true)
    public Byte getAttachType() {
        return attachType;
    }

    public void setAttachType(Byte attachType) {
        this.attachType = attachType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleAttachEntity that = (ArticleAttachEntity) o;

        if (id != that.id) return false;
        if (article != that.article) return false;
        if (attachUrl != null ? !attachUrl.equals(that.attachUrl) : that.attachUrl != null) return false;
        if (attachType != null ? !attachType.equals(that.attachType) : that.attachType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (attachUrl != null ? attachUrl.hashCode() : 0);
        result = 31 * result + (article != null ? article.hashCode() : 0);
        result = 31 * result + (attachType != null ? attachType.hashCode() : 0);
        return result;
    }
}
