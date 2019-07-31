package member.Kristen.pattern.Composite;

public class Cpp extends File{
    public Cpp (String name){
        super(name);

    }
    @Override
    public void display(){
        System.out.println(super.getName()+" 是一个C++文件");
    }

}
