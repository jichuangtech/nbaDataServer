package com.jichuangtech.nbadataserver.model;

import javax.persistence.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamInfoEntity that = (TeamInfoEntity) o;

        if (id != that.id) return false;
        if (teamname != null ? !teamname.equals(that.teamname) : that.teamname != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (teamhome != null ? !teamhome.equals(that.teamhome) : that.teamhome != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (siteurl != null ? !siteurl.equals(that.siteurl) : that.siteurl != null) return false;
        if (enName != null ? !enName.equals(that.enName) : that.enName != null) return false;
        if (joinyear != null ? !joinyear.equals(that.joinyear) : that.joinyear != null) return false;
        if (conference != null ? !conference.equals(that.conference) : that.conference != null) return false;
        if (division != null ? !division.equals(that.division) : that.division != null) return false;
        if (shortname != null ? !shortname.equals(that.shortname) : that.shortname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teamname != null ? teamname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (teamhome != null ? teamhome.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (siteurl != null ? siteurl.hashCode() : 0);
        result = 31 * result + (enName != null ? enName.hashCode() : 0);
        result = 31 * result + (joinyear != null ? joinyear.hashCode() : 0);
        result = 31 * result + (conference != null ? conference.hashCode() : 0);
        result = 31 * result + (division != null ? division.hashCode() : 0);
        result = 31 * result + (shortname != null ? shortname.hashCode() : 0);
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
                '}';
    }
}
