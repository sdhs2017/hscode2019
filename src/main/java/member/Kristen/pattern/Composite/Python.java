package member.Kristen.pattern.Composite;

public class Python extends File {
    public Python(String name){
        super(name);

    }
    @Override
    public void display(){
        System.out.println(super.getName()+" 是一个Python文件");
    }

}
