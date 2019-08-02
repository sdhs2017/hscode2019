package member.yiyang.composite;

/**
 * 子节点
 */
public class LeafNode implements Node{
    private String name;
    public LeafNode(String name) {
        //super();
        this.name = name;
    }

    @Override
    public void add(Node node) {

    }

    @Override
    public void remove(Node node) {

    }

    @Override
    public Node getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("访问:"+name);
    }
}
