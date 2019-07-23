package member.savilio.design_pattern.singleton.static_demo;

/**
 * 
众所周知，用static修饰的成员将具有最优先加载的权利，优先于一切非static成员之前，当然也包括各种构造方法，所以，这样的成员在内存的堆(Heap)空间内是无法存放的，它们会被存储到专门的静态域。

static成员加载的顺序是：static成员会依次从上至下的加载，而且加载时，先加载全部static成员的数据类型，并赋以默认值，然后再回过头来运行每个static成员的赋值语句！

 

所以，上面的代码运行流程是：

从上至下的加载，所以依次运行第3、5、7行的声明部分
加载StaticDemo demo成员变量(对象)，目前不运行赋值语句，基于它是复合数据类型，则默认值为null
加载int i1成员变量，目前不运行赋值语句，基于它是基本数据类型(又名简单数据类型)的int类型，则默认值为0
加载int i2成员变量，同上，默认值为0
加载static成员的数据类型完成，回过头来，从上至下依次完成第3、5、7行的赋值部分
运行第3行的赋值语句，则调用第10行开始的构造方法，运行完成后，则i1=1, i2=1
运行第5行的赋值语句，然而这行没有赋值语句，则跳过，则i1的值依然为1，i2没有发生变化依然为1
运行第7行的赋值语句，i2的值被赋值为0
说到底，其实i2是被赋值了2次的，起初默认值为0，第1次赋值出现在构造方法中，值被改变为1，第2次出现在第7行，值被改变为0。
 * 
 * @author Savilio
 *
 */
public class StaticDemo {
    /** 成员变量 */
    public static StaticDemo demo = new StaticDemo();
    /** 成员变量 */
    public static int i1;
    /** 成员变量 */
    public static int i2 = 0;
 
    /** 构造方法 */
    public StaticDemo() {
        i1++;
        i2++;
    }
    
//    public static StaticDemo demo = new StaticDemo();
 
    public static void main(String[] args) {
        System.out.println(i1);
        System.out.println(i2);
    }
}