package member.Kristen.pattern.adaptor1.Demo3_Obj;

import member.Kristen.pattern.adaptor1.Demo2_Class.USB;

/**
 * 这里不继承Macbook_TypeC 类，而是持有他的object
 * 跟类配置差不多
 * 好处：它可以同时转接多个类，而上一个不行因为只能继承一个类
 */
public class Adaptor implements USB {

    Macbook_TypeC mac;


    public Adaptor(Macbook_TypeC mac){
        this.mac=mac;
    }


    @Override
    public void transFiles() {
        System.out.println("开始配置");
        acceptFiles2();
    }


    public void acceptFiles2() {
        System.out.println("配置成功");
        mac.acceptFiles();
    }
}
