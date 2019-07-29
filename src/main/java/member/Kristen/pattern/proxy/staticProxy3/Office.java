package member.Kristen.pattern.proxy.staticProxy3;



public class Office {

    public static void main(String[] args) {

        TomA tomA=new TomA();
        JamesA jamesA=new JamesA();
        BanzhangA banzhangA=new BanzhangA(tomA,jamesA);

        VillanelleB villanelleB=new VillanelleB();
        EveB eveB=new EveB();
        BanzhangB banzhangB=new BanzhangB(villanelleB, eveB);

        System.out.println("老师在办公室里把作业给各班班长");
        banzhangA.homework();
        banzhangB.homework();
        //代理的好处就是不用再office把作业发给每一个人
        //。。。然而这真的简化了么。。。。。不还得在各个班长哪里添加成员



        Subject subject = new Subject();
        banzhangA.change(subject);
        banzhangB.change(subject);
        Boolean b=true;
        Boolean c=false;
        subject.newHW(b);

    }






}
