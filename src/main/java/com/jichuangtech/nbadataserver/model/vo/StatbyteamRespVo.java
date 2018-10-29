package com.jichuangtech.nbadataserver.model.vo;

import com.jichuangtech.nbadataserver.model.TeamInfoEntity;

public class StatbyteamRespVo {
    private int id;
    private String seanson;
    private String matchkind;
    private Integer teamid;
    private String teamName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeanson() {
        return seanson;
    }

    public void setSeanson(String seanson) {
        this.seanson = seanson;
    }

    public String getMatchkind() {
        return matchkind;
    }

    public void setMatchkind(String matchkind) {
        this.matchkind = matchkind;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getMatchcount() {
        return matchcount;
    }

    public void setMatchcount(Integer matchcount) {
        this.matchcount = matchcount;
    }

    public Double getPts() {
        return pts;
    }

    public void setPts(Double pts) {
        this.pts = pts;
    }

    public Double getLosepts() {
        return losepts;
    }

    public void setLosepts(Double losepts) {
        this.losepts = losepts;
    }

    public Double getFgp() {
        return fgp;
    }

    public void setFgp(Double fgp) {
        this.fgp = fgp;
    }

    public Double getThreefgp() {
        return threefgp;
    }

    public void setThreefgp(Double threefgp) {
        this.threefgp = threefgp;
    }

    public Double getFtfgp() {
        return ftfgp;
    }

    public void setFtfgp(Double ftfgp) {
        this.ftfgp = ftfgp;
    }

    public Double getRpg() {
        return rpg;
    }

    public void setRpg(Double rpg) {
        this.rpg = rpg;
    }

    public Double getApg() {
        return apg;
    }

    public void setApg(Double apg) {
        this.apg = apg;
    }

    public Double getBpg() {
        return bpg;
    }

    public void setBpg(Double bpg) {
        this.bpg = bpg;
    }

    public Double getSpg() {
        return spg;
    }

    public void setSpg(Double spg) {
        this.spg = spg;
    }

    public Double getTpg() {
        return tpg;
    }

    public void setTpg(Double tpg) {
        this.tpg = tpg;
    }

    public Double getFpg() {
        return fpg;
    }

    public void setFpg(Double fpg) {
        this.fpg = fpg;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "StatbyteamRespVo{" +
                "id=" + id +
                ", seanson='" + seanson + '\'' +
                ", matchkind='" + matchkind + '\'' +
                ", teamid=" + teamid +
                ", teamName=" + teamName +
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
