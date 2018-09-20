package com.jichuangtech.nbadataserver.model;

import javax.persistence.*;

@Entity
@Table(name = "t_matchresult", schema = "NBADATA", catalog = "")
public class MatchResultEntity {
    private int id;
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
    private TeamInfoEntity homeTeam;
    private TeamInfoEntity awayTeam;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Basic
    @Column(name = "gamedate", nullable = true, length = 45)
    public String getGamedate() {
        return gamedate;
    }

    public void setGamedate(String gamedate) {
        this.gamedate = gamedate;
    }

    @Basic
    @Column(name = "gametime", nullable = true, length = 45)
    public String getGametime() {
        return gametime;
    }

    public void setGametime(String gametime) {
        this.gametime = gametime;
    }

    @Basic
    @Column(name = "homepoint", nullable = true)
    public Integer getHomepoint() {
        return homepoint;
    }

    public void setHomepoint(Integer homepoint) {
        this.homepoint = homepoint;
    }

    @Basic
    @Column(name = "awaypoint", nullable = true)
    public Integer getAwaypoint() {
        return awaypoint;
    }

    public void setAwaypoint(Integer awaypoint) {
        this.awaypoint = awaypoint;
    }

    @Basic
    @Column(name = "homehalfpoint", nullable = true)
    public Integer getHomehalfpoint() {
        return homehalfpoint;
    }

    public void setHomehalfpoint(Integer homehalfpoint) {
        this.homehalfpoint = homehalfpoint;
    }

    @Basic
    @Column(name = "awayhalfpoint", nullable = true)
    public Integer getAwayhalfpoint() {
        return awayhalfpoint;
    }

    public void setAwayhalfpoint(Integer awayhalfpoint) {
        this.awayhalfpoint = awayhalfpoint;
    }

    @Basic
    @Column(name = "gameresult", nullable = true, length = 6)
    public String getGameresult() {
        return gameresult;
    }

    public void setGameresult(String gameresult) {
        this.gameresult = gameresult;
    }

    @Basic
    @Column(name = "rangfen", nullable = true, precision = 0)
    public Double getRangfen() {
        return rangfen;
    }

    public void setRangfen(Double rangfen) {
        this.rangfen = rangfen;
    }

    @Basic
    @Column(name = "rfresult", nullable = true, length = 45)
    public String getRfresult() {
        return rfresult;
    }

    public void setRfresult(String rfresult) {
        this.rfresult = rfresult;
    }

    @Basic
    @Column(name = "zongfen", nullable = true, precision = 0)
    public Double getZongfen() {
        return zongfen;
    }

    public void setZongfen(Double zongfen) {
        this.zongfen = zongfen;
    }

    @Basic
    @Column(name = "zfresult", nullable = true, length = 6)
    public String getZfresult() {
        return zfresult;
    }

    public void setZfresult(String zfresult) {
        this.zfresult = zfresult;
    }

    @Basic
    @Column(name = "season", nullable = true, length = 45)
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Basic
    @Column(name = "matchkind", nullable = true, length = 2)
    public String getMatchkind() {
        return matchkind;
    }

    public void setMatchkind(String matchkind) {
        this.matchkind = matchkind;
    }

    @ManyToOne
    @JoinColumn(name = "homeid", referencedColumnName = "ID", nullable = false)
    public TeamInfoEntity getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamInfoEntity homeTeam) {
        this.homeTeam = homeTeam;
    }

    @ManyToOne
    @JoinColumn(name = "awayid", referencedColumnName = "ID", nullable = false)
    public TeamInfoEntity getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamInfoEntity awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchResultEntity that = (MatchResultEntity) o;

        if (id != that.id) return false;
        if (gamedate != null ? !gamedate.equals(that.gamedate) : that.gamedate != null) return false;
        if (gametime != null ? !gametime.equals(that.gametime) : that.gametime != null) return false;
        if (homepoint != null ? !homepoint.equals(that.homepoint) : that.homepoint != null) return false;
        if (awaypoint != null ? !awaypoint.equals(that.awaypoint) : that.awaypoint != null) return false;
        if (homehalfpoint != null ? !homehalfpoint.equals(that.homehalfpoint) : that.homehalfpoint != null)
            return false;
        if (awayhalfpoint != null ? !awayhalfpoint.equals(that.awayhalfpoint) : that.awayhalfpoint != null)
            return false;
        if (gameresult != null ? !gameresult.equals(that.gameresult) : that.gameresult != null) return false;
        if (rangfen != null ? !rangfen.equals(that.rangfen) : that.rangfen != null) return false;
        if (rfresult != null ? !rfresult.equals(that.rfresult) : that.rfresult != null) return false;
        if (zongfen != null ? !zongfen.equals(that.zongfen) : that.zongfen != null) return false;
        if (zfresult != null ? !zfresult.equals(that.zfresult) : that.zfresult != null) return false;
        if (season != null ? !season.equals(that.season) : that.season != null) return false;
        if (matchkind != null ? !matchkind.equals(that.matchkind) : that.matchkind != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (gamedate != null ? gamedate.hashCode() : 0);
        result = 31 * result + (gametime != null ? gametime.hashCode() : 0);
        result = 31 * result + (homepoint != null ? homepoint.hashCode() : 0);
        result = 31 * result + (awaypoint != null ? awaypoint.hashCode() : 0);
        result = 31 * result + (homehalfpoint != null ? homehalfpoint.hashCode() : 0);
        result = 31 * result + (awayhalfpoint != null ? awayhalfpoint.hashCode() : 0);
        result = 31 * result + (gameresult != null ? gameresult.hashCode() : 0);
        result = 31 * result + (rangfen != null ? rangfen.hashCode() : 0);
        result = 31 * result + (rfresult != null ? rfresult.hashCode() : 0);
        result = 31 * result + (zongfen != null ? zongfen.hashCode() : 0);
        result = 31 * result + (zfresult != null ? zfresult.hashCode() : 0);
        result = 31 * result + (season != null ? season.hashCode() : 0);
        result = 31 * result + (matchkind != null ? matchkind.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MatchResultEntity{" +
                "id=" + id +
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
                ", homeTeam.name" + homeTeam.getShortname() +
                ", awayTeam.name=" + awayTeam.getShortname() +
                '}';
    }
}
