package member.Kristen.pattern.Template.Demo1;

public abstract class Process {
    String Meat;
    String Vege;
    final void Process(String Vege, String Meat){
        //包饺子： 1.胡萝卜羊肉 2.韭菜猪肉
        this.Meat=Meat;
        this.Vege=Vege;
        //1. 和面
        this.Huomian();

        //2. 洗菜 （胡罗卜， 韭菜）
        this.washVege(Vege);
        //3  切菜 （胡罗卜， 韭菜）
        this.cutVege(Vege);
        //4  切肉 （羊肉， 猪肉）
        this.cutMeat(Meat);
        //5  包起来
        this.bao();
        //6  丢进锅里
        this.cook();



    }

    public void Huomian (){
        System.out.println("和面");

    }

    public abstract void washVege(String vege);

    public abstract void cutVege(String vage);

    public abstract void cutMeat(String meat);

    public void bao(){
        System.out.println("擀皮然后把菜跟肉放进皮里包起来");
    }

    public void cook(){
        System.out.println("丢进锅里煮到沸腾");
    }

}
