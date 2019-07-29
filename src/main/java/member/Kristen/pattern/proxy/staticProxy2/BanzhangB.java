package member.Kristen.pattern.proxy.staticProxy2;

public class BanzhangB implements Student {
    private VillanelleB villanelleB;
    private EveB eveB;

    public BanzhangB(VillanelleB villanelleB, EveB eveB){
        this.villanelleB=villanelleB;
        this.eveB=eveB;

    }


    public void homework(){
        System.out.println("B班班长从任课老师那里拿到作业");
        villanelleB.homework();
        eveB.homework();
        System.out.println("发完作业");
        System.out.println(" ");
    }


}
