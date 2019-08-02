package member.yiyang.composite;

public interface Node {
    void add(Node node);
    void remove(Node node);
    Node getChild(int i);
    void operation();
}

