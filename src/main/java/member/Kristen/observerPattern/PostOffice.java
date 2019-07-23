package member.Kristen.observerPattern;

import java.util.ArrayList;

public class PostOffice implements Subject {


    //store all mails in this ArrayList
    private ArrayList<Mail> allMail;


    private ArrayList<observer> observers;


    //constructor
    public PostOffice(){
        allMail= new ArrayList<>();
        observers=new ArrayList<>();
       // System.out.println("in the constrctor");
    }



    //add mail to ArrayList allMail
    //!!!只要有新的mail进来，这个方法就会叫Notify
    //然后Notify会叫update（在Person里面）
    public void addMail(Mail mail){
        allMail.add(mail);
        Notify();
        //System.out.println("mail added, called Notify");
    }

    public void pickedUp(Mail mail){
        allMail.remove(mail);
    }


    //need a getter since ArrayList<Mail> is private
    public ArrayList<Mail> getState(){
        return allMail;

    }

    public void Attach(observer obs){
        observers.add(obs);
    }

    public void Dettach(observer obs){
        observers.remove(obs);
    }


    public void Notify(){
        for(int i=0; i<observers.size();i++){
            //this??
           // System.out.println("observers' size= "+ observers.size());
//            System.err.println(this);
//            System.out.println();
         observers.get(i).update(new PostOffice());
  //            observers.get(i).update(this);


        }
    }

}
