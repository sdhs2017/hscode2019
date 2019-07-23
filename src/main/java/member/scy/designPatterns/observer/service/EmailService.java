package member.scy.designPatterns.observer.service;

import member.scy.designPatterns.observer.entity.User;

/*
被观察者接口
 */
public interface EmailService {

    void addUser(User user);
    void romeUser(User user);
    void sendEmail();

}
