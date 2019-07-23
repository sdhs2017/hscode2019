package member.scy.designPatterns.observer.service.impl;

import member.scy.designPatterns.observer.entity.User;
import member.scy.designPatterns.observer.service.EmailService;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: hscode
 * @description: 邮箱service 被观察者实现
 * @author: shichengyu
 * @create: 2019-07-22 22:28
 **/
public class EmailServiceImpl implements EmailService {

    List<User> list =new ArrayList<User>();
    private String message;

    /** 
    * @Description: 添加用户 
    * @Param: [user] 
    * @return: void 
    * @Author: shichengyu 
    * @Date:2019/7/22 22:39
    */ 
    @Override
    public void addUser(User user) {
        list.add(user);

    }

    /** 
    * @Description: 删除用户 
    * @Param: [user] 
    * @return: void 
    * @Author: shichengyu 
    * @Date:2019/7/22 22:39
    */ 
    @Override
    public void romeUser(User user) {
        //判断是否为null
        if (!list.isEmpty()){
            list.remove(user);
        }
    }

    /** 
    * @Description: 发送email
    * @Param: [] 
    * @return: void 
    * @Author: shichengyu 
    * @Date:2019/7/22 22:39
    */ 
    @Override
    public void sendEmail() {
        //判断是否为null
        if (!list.isEmpty()){
            //遍历list
            list.forEach(user -> {
//                ObserverEmail observerEmail= user;
//                observerEmail.update(message);
                user.update(message);
//                System.out.println(user.getEmail() + user.getName());
            });
        }
    }

    public  void setSendEmail(String message) {
        this.message = message;
        System.out.println("更新消息： " + message);
        //消息更新，通知所有观察者
        sendEmail();
    }
}
