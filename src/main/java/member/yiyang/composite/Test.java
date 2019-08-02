package member.yiyang.composite;

public class Test {
    public static void main(String[] args) {

        Node node1 =new BranchNode();
        Node node2 =new BranchNode();
        Node leafNode1=new LeafNode("叶子节点1");
        Node leafNode2=new LeafNode("叶子节点2");
        Node leafNode3=new LeafNode("叶子节点3");
        node1.add(leafNode1);
        node1.add(node2);

        node2.add(leafNode2);
        node2.add(leafNode3);
        node1.operation();
        System.out.println("-------------");
        node2.operation();
    }

}
