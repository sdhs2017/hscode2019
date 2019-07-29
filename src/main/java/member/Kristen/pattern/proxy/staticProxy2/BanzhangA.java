package member.Kristen.pattern.proxy.staticProxy2;
//他是代理
public class BanzhangA implements Student{
   private TomA tomA;
   private JamesA jamesA;

   public BanzhangA(TomA tomA, JamesA jamesA){
       this.tomA=tomA;
       this.jamesA=jamesA;
   }

   public void homework(){
       System.out.println("A班班长从任课老师那里拿到作业");
       tomA.homework();
       jamesA.homework();
       System.out.println("发完作业");
       System.out.println(" ");
   }


}
