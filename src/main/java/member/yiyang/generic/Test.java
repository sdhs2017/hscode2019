package member.yiyang.generic;

/**
 * 1.泛型类  class class<T>
 * 2.泛型接口  interface class<T>
 * 3.泛型方法  public <T> class()
 * 4.泛型上下边界 class<T extends Number> obj
 * 5.泛型通配符 public void showKeyValue1(Generic<?> obj) 此处’？’是类型实参，而不是类型形参。是一种真实的类型。不是<T>
 */
public class Test {
    public static void main(String[] args) {
        ListMenu<String> ls = new ListMenu<>();
        ls.Add("啦啦啦");
        ls.Add("哈哈哈");
        ls.Add("安安安");
        IMyIterator list = ls.getList();
        while (list.hasNext()){
            String next = (String)list.next();
            System.out.println(next);
        }

        ListMenu<Integer> lint = new ListMenu<>();
        lint.Add(111);
        lint.Add(222);
        lint.Add(333);
        IMyIterator listInt = lint.getList();
        while (listInt.hasNext()){
            Integer next = (Integer)listInt.next();
            System.out.println(next);
        }
    }
}
