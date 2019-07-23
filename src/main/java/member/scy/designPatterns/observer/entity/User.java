package member.scy.designPatterns.observer.entity;

import member.scy.designPatterns.observer.service.ObserverEmail;

/**
 * @program: hscode
 * @description: user用户 观察者实现类
 * @author: shichengyu
 * @create: 2019-07-22 22:29
 **/
public class User implements ObserverEmail {
    private String name;
    private String email;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User(String name,String email,String message){
        this.name=name;
        this.email=email;
        this.message=message;
    }

    @Override
    public void update(String message) {
//        this.message = message;
        System.out.println(name+"接收消息："+message);
    }
}
