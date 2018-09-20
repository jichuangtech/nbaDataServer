package com.jichuangtech.nbadataserver.model.vo;

import com.jichuangtech.nbadataserver.model.TeamInfoEntity;

public class MatchResultRespVo {
    private int id;
    private Integer homeid;
    private Integer awayid;
    private String gamedate;
    private String gametime;
    private Integer homepoint;
    private Integer awaypoint;
    private Integer homehalfpoint;
    private Integer awayhalfpoint;
    private String gameresult;
    private Double rangfen;
    private String rfresult;
    private Double zongfen;
    private String zfresult;
    private String season;
    private String matchkind;
    private String homeTeamName;
    private String awayTeamName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    public Integer getAwayid() {
        return awayid;
    }

    public void setAwayid(Integer awayid) {
        this.awayid = awayid;
    }

    public String getGamedate() {
        return gamedate;
    }

    public void setGamedate(String gamedate) {
        this.gamedate = gamedate;
    }

    public String getGametime() {
        return gametime;
    }

    public void setGametime(String gametime) {
        this.gametime = gametime;
    }

    public Integer getHomepoint() {
        return homepoint;
    }

    public void setHomepoint(Integer homepoint) {
        this.homepoint = homepoint;
    }

    public Integer getAwaypoint() {
        return awaypoint;
    }

    public void setAwaypoint(Integer awaypoint) {
        this.awaypoint = awaypoint;
    }

    public Integer getHomehalfpoint() {
        return homehalfpoint;
    }

    public void setHomehalfpoint(Integer homehalfpoint) {
        this.homehalfpoint = homehalfpoint;
    }

    public Integer getAwayhalfpoint() {
        return awayhalfpoint;
    }

    public void setAwayhalfpoint(Integer awayhalfpoint) {
        this.awayhalfpoint = awayhalfpoint;
    }

    public String getGameresult() {
        return gameresult;
    }

    public void setGameresult(String gameresult) {
        this.gameresult = gameresult;
    }

    public Double getRangfen() {
        return rangfen;
    }

    public void setRangfen(Double rangfen) {
        this.rangfen = rangfen;
    }

    public String getRfresult() {
        return rfresult;
    }

    public void setRfresult(String rfresult) {
        this.rfresult = rfresult;
    }

    public Double getZongfen() {
        return zongfen;
    }

    public void setZongfen(Double zongfen) {
        this.zongfen = zongfen;
    }

    public String getZfresult() {
        return zfresult;
    }

    public void setZfresult(String zfresult) {
        this.zfresult = zfresult;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getMatchkind() {
        return matchkind;
    }

    public void setMatchkind(String matchkind) {
        this.matchkind = matchkind;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    @Override
    public String toString() {
        return "MatchResultRespVo{" +
                "id=" + id +
                ", homeid=" + homeid +
                ", awayid=" + awayid +
                ", gamedate='" + gamedate + '\'' +
                ", gametime='" + gametime + '\'' +
                ", homepoint=" + homepoint +
                ", awaypoint=" + awaypoint +
                ", homehalfpoint=" + homehalfpoint +
                ", awayhalfpoint=" + awayhalfpoint +
                ", gameresult='" + gameresult + '\'' +
                ", rangfen=" + rangfen +
                ", rfresult='" + rfresult + '\'' +
                ", zongfen=" + zongfen +
                ", zfresult='" + zfresult + '\'' +
                ", season='" + season + '\'' +
                ", matchkind='" + matchkind + '\'' +
                ", homeTeamName='" + homeTeamName + '\'' +
                ", awayTeamName='" + awayTeamName + '\'' +
                '}';
    }
}
