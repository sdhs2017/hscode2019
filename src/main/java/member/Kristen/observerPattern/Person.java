package member.Kristen.observerPattern;
import java.util.ArrayList;

public class Person implements observer {
    String name;


    //constructor
    public Person(String name){
        this.name=name;
    }
    //返回一个ArrayList里面存了所有的mail
    public void update(Object obj){
       // System.out.println("in update");
        if (obj instanceof PostOffice){
            //downcast
            PostOffice po= (PostOffice) obj;
            checkMail(po.getState());

        }
    }

    //match name 打印出新邮件
    public void checkMail(ArrayList<Mail> m){
       // System.out.println("in checkMail");
       // System.out.println("Mail size : "+m.size());
        for (int j=0; j<m.size(); j++){
            if(name.compareTo(m.get(j).receiverName )==0){
                System.out.println(" ");
                System.out.println("to "+name+ ", " +m.get(j).content);
                System.out.println("by "+m.get(j).sender);

            }else{System.out.println(" ");
                System.out.println(name+ ", you don't have any new mail");}

        }
    }




}
