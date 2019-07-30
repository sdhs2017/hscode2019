package member.Kristen.pattern.Builder.Demo1;

import java.util.ArrayList;

public class Commodity {
    ArrayList<Item> items=new ArrayList<>();

    /**
     *
     * @param item
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     *
     * @return
     */
    public float getCost(){
        float cost =(float)0.0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     *
     * @param col
     * @param sp
     */
    public void display(int col, int sp){

        for (Item item : items) {
            if (item instanceof Tshirt){
                System.out.println("Item : "+item.name()+"; colour : "+((Clothes) item).colour(col)+"; price : "+item.price());
                System.out.println("shipment : "+item.shipping(sp).shipping());

            }else if(item instanceof Pants){
                System.out.println("Item : "+item.name()+"; colour : "+((Clothes) item).colour(col)+"; price : "+item.price());
                System.out.println("shipment : "+item.shipping(sp).shipping());
            }
            else if (item instanceof Food){
                System.out.println("Item : "+item.name()+"; price : "+item.price());
                System.out.println("shipment : "+item.shipping(sp).shipping());
            }



        }
    }
}
