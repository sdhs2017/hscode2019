package member.ruinye.design_patterns.structural_patterns.composites;

public class User extends OrganizationTree{
    public User(String name, String root) {
        super(name, root);
    }

    @Override
    void showOrganization() {
        System.out.println(root+"   "+name);
    }
}
