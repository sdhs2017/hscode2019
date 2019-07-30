package member.savilio.design_pattern.observer.sourcecode;

public interface Observer {

    //？
    String getName();

    void setName(String name);

    void update(String status);
}
