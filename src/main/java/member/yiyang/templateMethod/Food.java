package member.yiyang.templateMethod;

public abstract class Food {
    abstract String Vegetables();
    abstract String Meat();
    public void createFood(){
        System.out.println(Vegetables()+"炒"+Meat());
    }
}
