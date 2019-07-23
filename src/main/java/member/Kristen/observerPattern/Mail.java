package member.Kristen.observerPattern;

public class Mail {
    String receiverName;
    String content;
    String address;
    String sender;

    //constructor
    //why not use modifier "static"?
    public Mail(String sender, String receiverName, String content, String address) {
        this.receiverName=receiverName;
        this.content=content;
        this.address=address;
        this.sender=sender;
    }

}
