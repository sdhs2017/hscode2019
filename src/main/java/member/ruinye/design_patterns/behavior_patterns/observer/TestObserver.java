package member.ruinye.design_patterns.behavior_patterns.observer;

import member.ruinye.design_patterns.behavior_patterns.observer.entity.Equipment;
import member.ruinye.design_patterns.behavior_patterns.observer.observer_interface.imp_observer_interface.EquipmentObserver;
import member.ruinye.design_patterns.behavior_patterns.observer.observer_interface.imp_observer_interface.StateObserver;
import member.ruinye.design_patterns.behavior_patterns.observer.subject.Equipment_Subject;

public class TestObserver {

    public static void main(String [] args){
        // 被观察者类
        Equipment_Subject equipment_subject = new Equipment_Subject();

        // 观察者
        new EquipmentObserver(equipment_subject);
        new StateObserver(equipment_subject);

        Equipment equipment = new Equipment();
        equipment.setId("1");
        equipment.setName("jyr-pc");
        equipment.setState("true");

        // 被观察者增加属性
        equipment_subject.setEquipment(equipment);

        equipment.setState("false");

        equipment_subject.setEquipment(equipment);

    }

}
