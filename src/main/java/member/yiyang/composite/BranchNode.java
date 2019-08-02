package member.yiyang.composite;

import java.util.ArrayList;

/**
 * 可理解为父节点
 */
public class BranchNode implements Node{

    private ArrayList<Node> childrenNode = new ArrayList<>();

    public void add(Node node) {
        childrenNode.add(node);
    }


    public void remove(Node node) {
    childrenNode.remove(node);
    }


    public Node getChild(int i) {
        return childrenNode.get(i);
    }


    public void operation() {
        for (Node node : childrenNode) {
            node.operation();
        }
    }
}