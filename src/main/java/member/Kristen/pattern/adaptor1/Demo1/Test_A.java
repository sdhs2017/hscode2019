package member.Kristen.pattern.adaptor1.Demo1;

public class Test_A {
    public static void main(String[] agrs){
        USB_flashDisk usb_f=new USB_flashDisk();
        MacBook mbook=new MacBook();

       Adaptor adaptor=new Adaptor(mbook);
        mbook.transData();
        usb_f.transFiles();
       adaptor.transFiles();
    }
}
