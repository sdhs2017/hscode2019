package member.Kristen.pattern.Template.Demo1;

public class LeekPorc extends Process{

    public LeekPorc(String Vege, String Meat){
        Process(Vege,Meat);
        //这里为什么不能直接用super（Vege，Meat）？？？

    }
    @Override
    public void washVege(String Vege){
        System.out.println("洗 "+Vege);
    }

    @Override
    public void cutVege(String Vege){
        System.out.println("切 "+Vege);
    }

    public void cutMeat(String Meat){
        System.out.println("切 "+ Meat);
    }
}
