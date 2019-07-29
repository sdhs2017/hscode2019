package member.Kristen.pattern.proxy.staticProxy3;

//他是代理
public class BanzhangA extends Observer implements Student  {
   private TomA tomA;
   private JamesA jamesA;

   public void change(Subject subject){
       this.subject=subject;
       subject.attach(this);
       //update();
   }


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


   public void update(){
       System.out.println("A:我知道啦马上来啦");
   }


}
