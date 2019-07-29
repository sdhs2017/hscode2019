package member.Kristen.pattern.proxy.staticProxy3;

public class BanzhangB extends Observer implements Student {
    private VillanelleB villanelleB;
    private EveB eveB;

    public void change(Subject subject){
        this.subject=subject;
        subject.attach(this);
        //update();
    }
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

    public void update(){
        System.out.println("B:我知道啦，马上来拿");
    }

}
