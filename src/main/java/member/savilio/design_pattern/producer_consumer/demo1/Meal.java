package member.savilio.design_pattern.producer_consumer.demo1;

/**
 *  餐
 */
public class Meal {

    /*
    取消构造则必须赋初始值，
    如果不在定义的时候初始化，那么既无法在构造函数中初始化，系统也不会赋默认值。则该变量被定义出来是毫无意义的。
     */
    private final int orderNum;
    /*
    如果用static final同时修饰变量的话，则变量必须在定义的时候进行初始化。
    因为static变量属于类，在调用构造函数之前就已经被系统赋予默认值了。
     */
//    private static final int orderNum2;

    public Meal(int orderNum){
        this.orderNum=orderNum;
    }

    @Override
    public String toString() {
        return "Meal " + orderNum;
    }


}
