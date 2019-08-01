package member.ruinye.design_patterns.structural_patterns.composites;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationTree{


    List<OrganizationTree> organizationTrees = new ArrayList<>();

    public Department(String name, String root) {
        super(name, root);
    }

    //

    @Override
    public boolean addDepartment(OrganizationTree organizationTree) {
        // 判断已有组织机构中是否包含新增部门
        if (organizationTrees.contains(organizationTree)){
            System.out.println("该部门已经创建！");
            return false;
        }else {
            // 遍历现有部门，判断新增部门的上级部门
            for (OrganizationTree ot : organizationTrees){
                // 上级部门存在进行添加操作
                if (ot.getName().equals(organizationTree.getRoot())){
                    organizationTrees.add(organizationTree);
                    return super.addDepartment(organizationTree);
                }
            }
            // 如果上级部门不存在则添加到跟最上层
            organizationTree.setRoot("/");
            organizationTrees.add(organizationTree);
            return super.addDepartment(organizationTree);
        }

    }

    @Override
    void showOrganization() {
        for (OrganizationTree organizationTree : organizationTrees){
            System.out.println(organizationTree.getRoot()+"   "+organizationTree.getName());
        }
    }
}
