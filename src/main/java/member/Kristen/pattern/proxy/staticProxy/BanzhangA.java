package member.Kristen.pattern.proxy.staticProxy;

//他是代理
public class BanzhangA implements Student {
   private TomA tomA;

   public BanzhangA(TomA tomA){
       this.tomA=tomA;
   }

   public void homework(){
       System.out.println("从任课老师那里接收A班作业");
       tomA.homework();
       System.out.println("发完作业");
   }


}
