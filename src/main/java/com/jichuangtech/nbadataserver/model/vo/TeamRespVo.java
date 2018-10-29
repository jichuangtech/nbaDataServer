package com.jichuangtech.nbadataserver.model.vo;

import com.jichuangtech.nbadataserver.model.StatbyteamEntity;

import java.util.List;

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
    private List<StatbyteamRespVo> mStatByList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl;
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

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public List<StatbyteamRespVo> getStatByList() {
        return mStatByList;
    }

    public void setStatByList(List<StatbyteamRespVo> statByList) {
        this.mStatByList = statByList;
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
                ", mStatByList='" + mStatByList + '\'' +
                '}';
    }
}
