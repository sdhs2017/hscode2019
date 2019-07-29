package member.Kristen.pattern.adaptor1.Demo2_Class;

public class Adaptor extends Macbook_TypeC implements USB {

    @Override
    public void transFiles() {
        System.out.println("开始配置");
        acceptFiles();
    }

    @Override
    public void acceptFiles() {
        System.out.println("配置成功");
        super.acceptFiles();
    }
}
