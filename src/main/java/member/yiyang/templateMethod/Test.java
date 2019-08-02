package member.yiyang.templateMethod;

public class Test {
    public static void main(String[] args) {

        Food food;

        food = new FoodA();
        food.createFood();

        food = new FoodB();
        food.createFood();
    }
}
