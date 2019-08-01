package member.ruinye.design_patterns.creative_patterns.builder.SuperClass;

public class Football_Bet {

    private Double tiedodds;

    public Double getTiedodds() {
        System.out.println("足球中有平局的赔率");
        return tiedodds;
    }

    public void setTiedodds(Double tiedodds) {
        System.out.println("足球中有平局的赔率");
        this.tiedodds = tiedodds;
    }
}
