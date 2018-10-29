package com.jichuangtech.nbadataserver.model;

import javax.persistence.*;

@Entity
@Table(name = "t_statbyteam", schema = "NBADATA", catalog = "")
public class StatbyteamEntity {
    private int id;
    private String seanson;
    private String matchkind;
    private TeamInfoEntity team;
    private Integer matchcount;
    private Double pts;
    private Double losepts;
    private Double fgp;
    private Double threefgp;
    private Double ftfgp;
    private Double rpg;
    private Double apg;
    private Double bpg;
    private Double spg;
    private Double tpg;
    private Double fpg;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "seanson", nullable = true, length = 45)
    public String getSeanson() {
        return seanson;
    }

    public void setSeanson(String seanson) {
        this.seanson = seanson;
    }

    @Basic
    @Column(name = "matchkind", nullable = true, length = 45)
    public String getMatchkind() {
        return matchkind;
    }

    public void setMatchkind(String matchkind) {
        this.matchkind = matchkind;
    }

    @ManyToOne
    @JoinColumn(name = "teamid", referencedColumnName = "ID", nullable = false)
    public TeamInfoEntity getTeam() {
        return team;
    }

    public void setTeam(TeamInfoEntity team) {
        this.team = team;
    }

    @Basic
    @Column(name = "matchcount", nullable = true)
    public Integer getMatchcount() {
        return matchcount;
    }

    public void setMatchcount(Integer matchcount) {
        this.matchcount = matchcount;
    }

    @Basic
    @Column(name = "pts", nullable = true, precision = 0)
    public Double getPts() {
        return pts;
    }

    public void setPts(Double pts) {
        this.pts = pts;
    }

    @Basic
    @Column(name = "losepts", nullable = true, precision = 0)
    public Double getLosepts() {
        return losepts;
    }

    public void setLosepts(Double losepts) {
        this.losepts = losepts;
    }

    @Basic
    @Column(name = "fgp", nullable = true, precision = 0)
    public Double getFgp() {
        return fgp;
    }

    public void setFgp(Double fgp) {
        this.fgp = fgp;
    }

    @Basic
    @Column(name = "threefgp", nullable = true, precision = 0)
    public Double getThreefgp() {
        return threefgp;
    }

    public void setThreefgp(Double threefgp) {
        this.threefgp = threefgp;
    }

    @Basic
    @Column(name = "ftfgp", nullable = true, precision = 0)
    public Double getFtfgp() {
        return ftfgp;
    }

    public void setFtfgp(Double ftfgp) {
        this.ftfgp = ftfgp;
    }

    @Basic
    @Column(name = "rpg", nullable = true, precision = 0)
    public Double getRpg() {
        return rpg;
    }

    public void setRpg(Double rpg) {
        this.rpg = rpg;
    }

    @Basic
    @Column(name = "apg", nullable = true, precision = 0)
    public Double getApg() {
        return apg;
    }

    public void setApg(Double apg) {
        this.apg = apg;
    }

    @Basic
    @Column(name = "bpg", nullable = true, precision = 0)
    public Double getBpg() {
        return bpg;
    }

    public void setBpg(Double bpg) {
        this.bpg = bpg;
    }

    @Basic
    @Column(name = "spg", nullable = true, precision = 0)
    public Double getSpg() {
        return spg;
    }

    public void setSpg(Double spg) {
        this.spg = spg;
    }

    @Basic
    @Column(name = "tpg", nullable = true, precision = 0)
    public Double getTpg() {
        return tpg;
    }

    public void setTpg(Double tpg) {
        this.tpg = tpg;
    }

    @Basic
    @Column(name = "fpg", nullable = true, precision = 0)
    public Double getFpg() {
        return fpg;
    }

    public void setFpg(Double fpg) {
        this.fpg = fpg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatbyteamEntity that = (StatbyteamEntity) o;

        if (id != that.id) return false;
        if (seanson != null ? !seanson.equals(that.seanson) : that.seanson != null) return false;
        if (matchkind != null ? !matchkind.equals(that.matchkind) : that.matchkind != null) return false;
        if (matchcount != null ? !matchcount.equals(that.matchcount) : that.matchcount != null) return false;
        if (pts != null ? !pts.equals(that.pts) : that.pts != null) return false;
        if (losepts != null ? !losepts.equals(that.losepts) : that.losepts != null) return false;
        if (fgp != null ? !fgp.equals(that.fgp) : that.fgp != null) return false;
        if (threefgp != null ? !threefgp.equals(that.threefgp) : that.threefgp != null) return false;
        if (ftfgp != null ? !ftfgp.equals(that.ftfgp) : that.ftfgp != null) return false;
        if (rpg != null ? !rpg.equals(that.rpg) : that.rpg != null) return false;
        if (apg != null ? !apg.equals(that.apg) : that.apg != null) return false;
        if (bpg != null ? !bpg.equals(that.bpg) : that.bpg != null) return false;
        if (spg != null ? !spg.equals(that.spg) : that.spg != null) return false;
        if (tpg != null ? !tpg.equals(that.tpg) : that.tpg != null) return false;
        if (fpg != null ? !fpg.equals(that.fpg) : that.fpg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (seanson != null ? seanson.hashCode() : 0);
        result = 31 * result + (matchkind != null ? matchkind.hashCode() : 0);
        result = 31 * result + (matchcount != null ? matchcount.hashCode() : 0);
        result = 31 * result + (pts != null ? pts.hashCode() : 0);
        result = 31 * result + (losepts != null ? losepts.hashCode() : 0);
        result = 31 * result + (fgp != null ? fgp.hashCode() : 0);
        result = 31 * result + (threefgp != null ? threefgp.hashCode() : 0);
        result = 31 * result + (ftfgp != null ? ftfgp.hashCode() : 0);
        result = 31 * result + (rpg != null ? rpg.hashCode() : 0);
        result = 31 * result + (apg != null ? apg.hashCode() : 0);
        result = 31 * result + (bpg != null ? bpg.hashCode() : 0);
        result = 31 * result + (spg != null ? spg.hashCode() : 0);
        result = 31 * result + (tpg != null ? tpg.hashCode() : 0);
        result = 31 * result + (fpg != null ? fpg.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StatbyteamEntity{" +
                "id=" + id +
                ", seanson='" + seanson + '\'' +
                ", matchkind='" + matchkind + '\'' +
                ", team.name=" + team.getShortname() +
                ", matchcount=" + matchcount +
                ", pts=" + pts +
                ", losepts=" + losepts +
                ", fgp=" + fgp +
                ", threefgp=" + threefgp +
                ", ftfgp=" + ftfgp +
                ", rpg=" + rpg +
                ", apg=" + apg +
                ", bpg=" + bpg +
                ", spg=" + spg +
                ", tpg=" + tpg +
                ", fpg=" + fpg +
                '}';
    }
}
