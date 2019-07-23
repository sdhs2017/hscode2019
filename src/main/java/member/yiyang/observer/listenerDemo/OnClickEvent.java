package member.yiyang.observer.listenerDemo;

/**
 * 点击事件 继承基础事件
 * 触发点击时，进行某些操作
 */
public class OnClickEvent extends BaseEvent {

    public void onclick(String name){

        if("onclick".equals(name)){
            //doSomething
            System.out.println("参数："+name+"；触发点击事件！");
        }else{
            System.out.println("参数："+name);
        }

        notify(name);
    }
}
