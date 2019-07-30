package member.Kristen.pattern.Builder.Demo1;

/**
 * 商场里只有两种商品： 1.clothes
 *                  2.food
 */
public abstract class Clothes implements Item {

    /**
     * @Override
     *
     */
    public Shipping shipping(int i) {
        int k=i;
        switch (k) {
            case 1:
                return new FreeShipping();

            case 2:
                return new NormalShipping();

            case 3:
                return new Express();

            default:
                return new NormalShipping();
        }

    }


    /**
     * @Overiide
     * @return
     */
    public abstract float price();


    /**\
     * 只有衣服有颜色（谁管你食物啥色的），
     * 所以colour只在衣服的接口里定义了
     * @return
     */
    public abstract String colour(int i);

}
