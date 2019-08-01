package member.ruinye.design_patterns.creative_patterns.builder;

import member.ruinye.design_patterns.creative_patterns.builder.entity.FootballMatch;

import java.util.Date;

public class TestBuilder {

    public static void main(String [] args){

        FootballBuilder footballBuilder = new FootballBuilder();
        footballBuilder.setHomeTeam("山东鲁能泰山队");
        footballBuilder.setVisitTeam("拜仁慕尼黑队");
        footballBuilder.setMatchDate(new Date());
        footballBuilder.setMatchField("济南奥体中心大球场");

        FootballMatch footballMatch = footballBuilder.build();

        System.out.println("赛程刚刚公布，还未有菠菜公司开出赔率，当前赛事的信息为：");
        System.out.println(footballMatch.getHomeTeam()+"VS"+footballMatch.getVisitTeam()+"  地点："+footballMatch.getMatchField()+"  赔率信息：主胜"+footballMatch.getHomeOdds()+" 平局"+footballMatch.getTiedOdds()+"  客胜"+footballMatch.getVisitOdds());

        System.out.println("滞后的菠菜公司终于开出赔率了");
        footballBuilder.setHomeOdds(12.5);
        footballBuilder.setTiedOdds(5.0);
        footballBuilder.setVisitOdds(1.02);

        footballMatch = footballBuilder.build();

        System.out.println(footballMatch.getHomeTeam()+"VS"+footballMatch.getVisitTeam()+"  地点："+footballMatch.getMatchField()+"  赔率信息：主胜"+footballMatch.getHomeOdds()+" 平局"+footballMatch.getTiedOdds()+"  客胜"+footballMatch.getVisitOdds());

    }
}
