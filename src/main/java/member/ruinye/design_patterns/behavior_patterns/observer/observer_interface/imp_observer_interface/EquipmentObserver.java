package member.ruinye.design_patterns.behavior_patterns.observer.observer_interface.imp_observer_interface;

import member.ruinye.design_patterns.behavior_patterns.observer.entity.Equipment;
import member.ruinye.design_patterns.behavior_patterns.observer.observer_interface.Equipment_Observer;
import member.ruinye.design_patterns.behavior_patterns.observer.subject.Equipment_Subject;


import java.util.ArrayList;
import java.util.List;

public class EquipmentObserver implements Equipment_Observer {

    private Equipment_Subject equipment_subject;

    public EquipmentObserver(Equipment_Subject equipment_subject){
        this.equipment_subject = equipment_subject;
        this.equipment_subject.addObserver(this);
    }

    // 设备信息
    private List<Equipment> equipments = new ArrayList<>();


    @Override
    public void getEquipment(Equipment equipment) {

        // 遍历list中资产
        // 资产是否存在，默认不存在
        boolean ishava = false;
        for(Equipment eqm : equipments){
            // 如果id存在则删除原有添加新的
            if (eqm.getId().equals(equipment.getId())){
                equipments.remove(eqm);
                equipments.add(equipment);
                ishava = true;
                System.out.println("修改资产信息："+equipment.getId()+"  "+equipment.getName()+"  "+equipment.getState());
                break;
            }
        }
        if (!ishava){
            equipments.add(equipment);
            System.out.println("新增资产信息："+equipment.getId()+"  "+equipment.getName()+"  "+equipment.getState());
        }


    }
}
