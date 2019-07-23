package member.Kristen.observerPattern;

public interface Subject {
    void Attach(observer obs);
    void Dettach(observer obs);
    void Notify();



}
