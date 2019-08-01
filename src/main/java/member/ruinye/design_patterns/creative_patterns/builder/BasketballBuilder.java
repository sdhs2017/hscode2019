package member.ruinye.design_patterns.creative_patterns.builder;

import member.ruinye.design_patterns.creative_patterns.builder.SuperClass.Basketball_Bet;
import member.ruinye.design_patterns.creative_patterns.builder.entity.BasketballMatch;

import java.util.Date;

public class BasketballBuilder extends Basketball_Bet implements I_Bet {

    private BasketballMatch basketballMatch;

    public BasketballBuilder(){
        basketballMatch = new BasketballMatch();
    }

    @Override
    public void setMatchDate(Date matchdate) {
        basketballMatch.setMatchDate(matchdate);
    }

    @Override
    public void setMatchField(String matchfield) {
        basketballMatch.setMatchField(matchfield);
    }

    @Override
    public void setMatchType(String matchtype) {
        basketballMatch.setMatchType(matchtype);
    }

    @Override
    public void setHomeTeam(String hometeam) {
        basketballMatch.setHomeTeam(hometeam);
    }

    @Override
    public void setVisitTeam(String visitteam) {
        basketballMatch.setVisitTeam(visitteam);
    }

    @Override
    public void setHomeOdds(Double homeodds) {
        basketballMatch.setHomeOdds(homeodds);
    }

    @Override
    public void setVisitOdds(Double visitodds) {
        basketballMatch.setVisitOdds(visitodds);
    }

    @Override
    public void setTiedOdds(Double tiedodds) {
        System.out.println("篮球不需要这项操作");
    }
}
