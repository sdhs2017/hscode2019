package observer.observer_interface.imp_observer_interface;

import observer.entity.Equipment;

import observer_interface.Equipment_Observer;
import subject.Equipment_Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * 观察者实现之维护状态
 */
public class StateObserver implements Equipment_Observer {

    private Equipment_Subject equipment_subject;

    public StateObserver(Equipment_Subject equipment_subject){
        this.equipment_subject = equipment_subject;
        this.equipment_subject.addObserver(this);
    }

    // 状态信息，key是id，value是状态
    private Map<String,String> states = new HashMap<>();

    @Override
    public void getEquipment(Equipment equipment) {
        if (equipment!=null){
            states.put(equipment.getId(), equipment.getState());
            System.out.println("状态属性变更：");
            for(String key:states.keySet()){
                System.out.println("id:"+key+"  state:"+states.get(key));
            }

        }
    }

}
