package com.jichuangtech.nbadataserver.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "t_teaminfo", schema = "NBADATA", catalog = "")
public class TeamInfoEntity {
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
    private List<MatchResultEntity> homeMatchResultList;
    private List<MatchResultEntity> awayMatchResultList;
    private List<StatbyteamEntity> mStatByList;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TEAMNAME", nullable = true, length = 45)
    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    @Basic
    @Column(name = "CITY", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "TEAMHOME", nullable = true, length = 45)
    public String getTeamhome() {
        return teamhome;
    }

    public void setTeamhome(String teamhome) {
        this.teamhome = teamhome;
    }

    @Basic
    @Column(name = "CAPACITY", nullable = true)
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "SITEURL", nullable = true, length = 60)
    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl;
    }

    @Basic
    @Column(name = "en_NAME", nullable = true, length = 45)
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Basic
    @Column(name = "JOINYEAR", nullable = true, length = 45)
    public String getJoinyear() {
        return joinyear;
    }

    public void setJoinyear(String joinyear) {
        this.joinyear = joinyear;
    }

    @Basic
    @Column(name = "CONFERENCE", nullable = true, length = 45)
    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    @Basic
    @Column(name = "division", nullable = true, length = 45)
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Basic
    @Column(name = "shortname", nullable = true, length = 45)
    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }


    @OneToMany(mappedBy = "homeTeam")
    public List<MatchResultEntity> getHomeMatchResultList() {
        return homeMatchResultList;
    }

    public void setHomeMatchResultList(List<MatchResultEntity> matchResultList) {
        this.homeMatchResultList = matchResultList;
    }

    @OneToMany(mappedBy = "awayTeam")
    public List<MatchResultEntity> getAwayMatchResultList() {
        return awayMatchResultList;
    }

    public void setAwayMatchResultList(List<MatchResultEntity> awayMatchResultList) {
        this.awayMatchResultList = awayMatchResultList;
    }

    @OneToMany(mappedBy = "team")
    public List<StatbyteamEntity>  getStatByList() {
        return mStatByList;
    }

    public void setStatByList(List<StatbyteamEntity> statByList) {
        this.mStatByList = statByList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamInfoEntity)) return false;

        TeamInfoEntity that = (TeamInfoEntity) o;

        if (getId() != that.getId()) return false;
        if (getTeamname() != null ? !getTeamname().equals(that.getTeamname()) : that.getTeamname() != null)
            return false;
        if (getCity() != null ? !getCity().equals(that.getCity()) : that.getCity() != null) return false;
        if (getTeamhome() != null ? !getTeamhome().equals(that.getTeamhome()) : that.getTeamhome() != null)
            return false;
        if (getCapacity() != null ? !getCapacity().equals(that.getCapacity()) : that.getCapacity() != null)
            return false;
        if (getSiteurl() != null ? !getSiteurl().equals(that.getSiteurl()) : that.getSiteurl() != null) return false;
        if (getEnName() != null ? !getEnName().equals(that.getEnName()) : that.getEnName() != null) return false;
        if (getJoinyear() != null ? !getJoinyear().equals(that.getJoinyear()) : that.getJoinyear() != null)
            return false;
        if (getConference() != null ? !getConference().equals(that.getConference()) : that.getConference() != null)
            return false;
        if (getDivision() != null ? !getDivision().equals(that.getDivision()) : that.getDivision() != null)
            return false;
        if (getShortname() != null ? !getShortname().equals(that.getShortname()) : that.getShortname() != null)
            return false;
        if (homeMatchResultList != null ? !homeMatchResultList.equals(that.homeMatchResultList) : that.homeMatchResultList != null)
            return false;
        return getAwayMatchResultList() != null ? getAwayMatchResultList().equals(that.getAwayMatchResultList()) : that.getAwayMatchResultList() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getTeamname() != null ? getTeamname().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getTeamhome() != null ? getTeamhome().hashCode() : 0);
        result = 31 * result + (getCapacity() != null ? getCapacity().hashCode() : 0);
        result = 31 * result + (getSiteurl() != null ? getSiteurl().hashCode() : 0);
        result = 31 * result + (getEnName() != null ? getEnName().hashCode() : 0);
        result = 31 * result + (getJoinyear() != null ? getJoinyear().hashCode() : 0);
        result = 31 * result + (getConference() != null ? getConference().hashCode() : 0);
        result = 31 * result + (getDivision() != null ? getDivision().hashCode() : 0);
        result = 31 * result + (getShortname() != null ? getShortname().hashCode() : 0);
        result = 31 * result + (homeMatchResultList != null ? homeMatchResultList.hashCode() : 0);
        result = 31 * result + (getAwayMatchResultList() != null ? getAwayMatchResultList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TeamInfoEntity{" +
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
                ", homeMatchResultList.size=" + homeMatchResultList.size() +
                ", awayMatchResultList.size=" + awayMatchResultList.size() +
                ", mStatByList.size" + mStatByList.size() +
                '}';
    }
}
