package member.savilio.design_pattern.Observer.demo1;

import java.util.Observable;

/**
 * 观察者模式demo1：古董，价格变动
 */
public class Antique extends Observable {

    private float price;

    public Antique(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        super.setChanged();
        super.notifyObservers(price);   //价格变动
        this.price=price;
    }

    public String toString(){
        return "古董价格为："+this.price;
    }











}
