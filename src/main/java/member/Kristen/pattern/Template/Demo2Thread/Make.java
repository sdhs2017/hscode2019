package member.Kristen.pattern.Template.Demo2Thread;



public class Make {
    public static void main(String[] args) {

//        LeekPorc leekPorc1=new LeekPorc();
//
//        CarrotLamb carrotLamb=new CarrotLamb();


        int i=1;
        int j=2;
        Resource resource = new Resource();

        Producer p1 = new Producer(resource,1 );
        Producer p2= new Producer(resource, 2);

        Consumer c1 = new Consumer(resource);

        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(p2);
        Thread thread3 = new Thread(c1);



        thread1.start();
        thread2.start();
        thread3.start();

    }
}
