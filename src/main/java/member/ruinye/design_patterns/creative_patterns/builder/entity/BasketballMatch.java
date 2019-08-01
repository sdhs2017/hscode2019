package member.ruinye.design_patterns.creative_patterns.builder.entity;

import java.util.Date;

public class BasketballMatch {
    // 属性
    private Date MatchDate;
    private String MatchField;
    private String MatchType;
    private String HomeTeam;
    private String VisitTeam;
    private Double HomeOdds;
    private Double VisitOdds;

    public Date getMatchDate() {
        return MatchDate;
    }

    public void setMatchDate(Date matchDate) {
        MatchDate = matchDate;
    }

    public String getMatchField() {
        return MatchField;
    }

    public void setMatchField(String matchField) {
        MatchField = matchField;
    }

    public String getMatchType() {
        return MatchType;
    }

    public void setMatchType(String matchType) {
        MatchType = matchType;
    }

    public String getHomeTeam() {
        return HomeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        HomeTeam = homeTeam;
    }

    public String getVisitTeam() {
        return VisitTeam;
    }

    public void setVisitTeam(String visitTeam) {
        VisitTeam = visitTeam;
    }

    public Double getHomeOdds() {
        return HomeOdds;
    }

    public void setHomeOdds(Double homeOdds) {
        HomeOdds = homeOdds;
    }

    public Double getVisitOdds() {
        return VisitOdds;
    }

    public void setVisitOdds(Double visitOdds) {
        VisitOdds = visitOdds;
    }
}
