package com.jichuangtech.nbadataserver.model.vo;

public class TeamRespVo {
    private int id;
    private String teamname;
    private String city;
    private String teamhome;
    private Integer capacity;
    private String siteurl;
    private String enName;
    private String joinyear;
    private String conference;
    private String division;
    private String shortname;

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamhome() {
        return teamhome;
    }

    public void setTeamhome(String teamhome) {
        this.teamhome = teamhome;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getJoinyear() {
        return joinyear;
    }

    public void setJoinyear(String joinyear) {
        this.joinyear = joinyear;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Override
    public String toString() {
        return "TeamRespVo{" +
                "id=" + id +
                ", teamname='" + teamname + '\'' +
                ", city='" + city + '\'' +
                ", teamhome='" + teamhome + '\'' +
                ", capacity=" + capacity +
                ", siteurl='" + siteurl + '\'' +
                ", enName='" + enName + '\'' +
                ", joinyear='" + joinyear + '\'' +
                ", conference='" + conference + '\'' +
                ", division='" + division + '\'' +
                ", shortname='" + shortname + '\'' +
                '}';
    }
}
