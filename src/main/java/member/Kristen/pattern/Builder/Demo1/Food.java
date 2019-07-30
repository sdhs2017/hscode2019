package member.Kristen.pattern.Builder.Demo1;

/**
 * 商场里只有两种商品： 1.clothes
 *                  2.food
 */

public abstract class Food implements Item {


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


//    /**
//     * @Override
//     * 无参， 免邮
//     */
//    public Shipping shipping() {
//        return new FreeShipping();
//    }
//
//    /**\
//     *  有参， 10块的正常邮寄
//     * @param yf
//     * @return
//     */
//    public Shipping shipping(int yf){
//        return new NormalShipping();
//    }
//
//    /**
//     * 有参， “快点” ， 50块的快速邮寄
//     * @param Hurryup
//     * @return
//     */
//    public Shipping shipping(String Hurryup){
//        return new Express();
//    }

    /**
     * @Overiide
     * @return
     */
    public abstract float price();

}
