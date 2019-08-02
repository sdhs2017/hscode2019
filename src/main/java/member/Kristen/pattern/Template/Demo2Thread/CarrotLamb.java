package member.Kristen.pattern.Template.Demo2Thread;

public class CarrotLamb extends Process {
    String Vege="胡萝卜";
    String Meat="羊肉";
    public CarrotLamb(){
        Process(Vege,Meat);
        //这里为什么不能直接用super（Vege，Meat）？？？

    }
    @Override
    public void washVege(){
       // System.out.println("洗 "+Vege);
    }

    @Override
    public void cutVege(){
        //System.out.println("切 "+Vege);
    }

    public void cutMeat(){
       // System.out.println("切 "+ Meat);
    }
}
