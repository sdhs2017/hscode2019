package member.ruinye.design_patterns.structural_patterns.composites;


/**
 * 组织树作为部门和用户的抽象类，包含通用属性和方法
 */
public abstract class OrganizationTree {

    // 部门名或用户名
    String name;
    // 根组织
    String root;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public OrganizationTree(String name, String root){
        this.name = name;
        this.root = root;
    }

    public boolean addDepartment(OrganizationTree organizationTree){
       return true;
    }

    abstract void showOrganization();
}
