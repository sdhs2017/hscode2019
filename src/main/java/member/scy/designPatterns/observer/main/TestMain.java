package member.scy.designPatterns.observer.main;

import member.scy.designPatterns.observer.entity.User;
import member.scy.designPatterns.observer.service.impl.EmailServiceImpl;

/**
 * @program: hscode
 * @description: main测试
 * @author: shichengyu
 * @create: 2019-07-22 22:55
 **/
public class TestMain {

    public static void main(String[] args) {
        User user =new User("liming","11@qq.com","我是李明");
        User user2 =new User("小明","22@qq.com","我是小明明");
        User user3 =new User("小李","33@qq.com","我是小李");

        EmailServiceImpl emailService=new EmailServiceImpl();
        emailService.addUser(user);
        emailService.addUser(user2);
        emailService.addUser(user3);
        emailService.setSendEmail("我是石成宇");

        emailService.romeUser(user);

        emailService.setSendEmail("我是大好人");

    }


}
