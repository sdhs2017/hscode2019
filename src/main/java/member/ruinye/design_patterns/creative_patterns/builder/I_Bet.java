package member.ruinye.design_patterns.creative_patterns.builder;

import java.util.Date;

public interface I_Bet {

    // 比赛时间
    public void setMatchDate(Date matchdate);
    // 比赛地点
    public void setMatchField(String matchfield);
    // 赛事类别
    public void setMatchType(String matchtype);
    // 比赛双方，主队、客队
    public void setHomeTeam(String hometeam);
    public void setVisitTeam(String visitteam);
    // 基本赔率信息
    public void setHomeOdds(Double homeodds);
    public void setVisitOdds(Double visitodds);
    public void setTiedOdds(Double tiedodds);

}
