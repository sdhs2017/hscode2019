package member.Kristen.pattern.adaptor1.Demo3_Obj;

/**
 * 这是一个单继承的机制
 * 所以类适配器需要继承Macbook_Typec类
 * 要求USB必须是接口
 */
public class Client {

    public static void main (String[] args){
        Macbook_TypeC mac=new Macbook_TypeC();
      Adaptor adaptor=new Adaptor(mac);
        System.out.println("starting to trans files from usb");
        //transFiles() is from USB接口

        adaptor.transFiles();





    }
}
