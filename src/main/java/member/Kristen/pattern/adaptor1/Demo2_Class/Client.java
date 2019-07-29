package member.Kristen.pattern.adaptor1.Demo2_Class;

/**
 * 这是一个单继承的机制
 * 所以类适配器需要继承Macbook_Typec类
 * 要求USB必须是接口
 */
public class Client {

    public static void main (String[] args){
        USB usb= new Adaptor();
        System.out.println("starting to trans files from usb");
        usb.transFiles();



    }
}
