package member.Kristen.pattern.Builder.Demo1;

public class CommodityBuilder {

    /**
     * 在builder这里可以是先别的分类
     * @return
     */
    public Commodity cloth(){
        Commodity commodity=new Commodity();
        commodity.addItem(new Pants());
        commodity.addItem(new Tshirt());
        return commodity;
    }

    public Commodity food(){
        Commodity commodity=new Commodity();
        commodity.addItem(new Chips());

        return commodity;
    }


    public Commodity needItImmediatly(){
        Commodity commodity=new Commodity();
        commodity.addItem(new Tshirt());
        commodity.addItem(new Chips());
        return commodity;
    }

}
