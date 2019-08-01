package member.ruinye.design_patterns.creative_patterns.builder;

import member.ruinye.design_patterns.creative_patterns.builder.SuperClass.Football_Bet;
import member.ruinye.design_patterns.creative_patterns.builder.entity.FootballMatch;

import java.util.Date;

public class FootballBuilder extends Football_Bet implements I_Bet {

    private FootballMatch footballMatch = new FootballMatch();


    @Override
    public void setMatchDate(Date matchdate) {
        footballMatch.setMatchDate(matchdate);
    }

    @Override
    public void setMatchField(String matchfield) {
        footballMatch.setMatchField(matchfield);
    }

    @Override
    public void setMatchType(String matchtype) {
        footballMatch.setMatchType(matchtype);
    }

    @Override
    public void setHomeTeam(String hometeam) {
        footballMatch.setHomeTeam(hometeam);
    }

    @Override
    public void setVisitTeam(String visitteam) {
        footballMatch.setVisitTeam(visitteam);
    }

    @Override
    public void setHomeOdds(Double homeodds) {
        footballMatch.setHomeOdds(homeodds);
    }

    @Override
    public void setVisitOdds(Double visitodds) {
        footballMatch.setVisitOdds(visitodds);
    }

    @Override
    public void setTiedOdds(Double tiedodds) {
        super.setTiedodds(tiedodds);
        footballMatch.setTiedOdds(super.getTiedodds());
    }

    public FootballMatch build(){
        return this.footballMatch;
    }
}
