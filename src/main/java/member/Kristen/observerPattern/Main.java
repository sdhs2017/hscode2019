package member.Kristen.observerPattern;


import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws Exception{
        File file =new File("C:\\soft\\ide\\workspace\\hscode2019\\src\\main\\java\\member\\Kristen\\observerPattern\\listofnames");
        BufferedReader br= new BufferedReader(new FileReader(file));
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Person> people=new ArrayList<>();
        String st;

         while ((st = br.readLine()) != null) {
            //System.out.println(st);
            names.add(st);
        }

        //
        for(int i=0;i<names.size();i++){
            people.add(i,new Person(names.get(i)));

        }

        //打印所有的person object
//        for(int i=0; i< people.size(); i++){
//            System.err.println(people.get(i).name);
//        }





        PostOffice pf=new PostOffice();
        Person Ingrit= new Person("Ingrit");
        Person John =new Person("John");
        Mail m = new Mail("Ingrit","John","YOU KNOW NOTHING JOHN SNOW", "WinterFall");
        Mail m1 = new Mail("Ayra","John","I MISS YOU", "WinterFall");
        Mail m3 = new Mail("Ayra","Cersei","I WILL KILL YOU", "westeros");
        //Ayra not in the names list,
        //她不是观察者
        Mail m2= new Mail("Sansa","Ayra","no where","HI");

        //让他们成为观察者
        pf.Attach(Ingrit);
        pf.Attach(John);

        for(int i=0; i< people.size(); i++){
            pf.Attach(people.get(i));
        }

        pf.addMail(m);
        System.out.println(" ");
        System.out.println("-----------------------------end of the first update-----------------------------------------------");
        pf.pickedUp(m);
        pf.addMail(m3);






    }

}
