package member.ruinye.design_patterns.structural_patterns.composites;

public class TestComposites {

    public static void main(String [] args){
        // 创建最上层部门
        OrganizationTree root = new Department("公司","/");
        root.addDepartment(root);

        // 创建部门
        OrganizationTree department1 = new Department("技术部","公司");
        OrganizationTree department2 = new Department("商务部","公司");
        OrganizationTree department3 = new Department("QC部","技术部");
        OrganizationTree department4 = new Department("研发部","技术部");

        root.addDepartment(department1);
        root.addDepartment(department2);
        root.addDepartment(department3);
        root.addDepartment(department4);
        root.addDepartment(department4);

        // 创建人员
        OrganizationTree user1 = new User("张三","技术部");
        OrganizationTree user2 = new User("李四","研发部");
        OrganizationTree user3 = new User("王五","商务部");
        OrganizationTree user4 = new User("赵六","QC部");

        root.addDepartment(user1);
        root.addDepartment(user2);
        root.addDepartment(user3);
        root.addDepartment(user4);

        OrganizationTree user = new User("大佬",null);
        root.addDepartment(user);

        root.showOrganization();

    }

}
