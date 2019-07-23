package subject;

import observer.entity.Equipment;
import observer_interface.Equipment_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实体类
 */
public class Equipment_Subject {

    // 定义一个或多个观察者
    private List<Equipment_Observer> equipment_observers = new ArrayList<>();

    // 定义被观察者属性
    private observer.entity.Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
        notifyObserver();
    }

    public void removeEquipment(Equipment equipment){
        this.equipment = equipment;
        notifyObserver();
    }

    // 添加观察者方法
    public void addObserver(Equipment_Observer observer){
        equipment_observers.add(observer);
    }

    // 删除观察者方法
    public void delObserver(Equipment_Observer observer){
        if (!equipment_observers.isEmpty()){
            equipment_observers.add(observer);
        }
    }

    // 回调方法，通知观察者属性的变化
    public void notifyObserver(){
        for (Equipment_Observer observer:equipment_observers){
            observer.getEquipment(equipment);
        }
    }
}
