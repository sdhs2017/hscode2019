package member.Kristen.pattern.Composite;


public class Java extends File {


    public Java(String name){
        super(name);

    }

    @Override
    public void display(){
        System.out.println(super.getName()+" 是一个Java文件");
    }

}
