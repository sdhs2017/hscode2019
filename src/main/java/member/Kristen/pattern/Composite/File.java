package member.Kristen.pattern.Composite;

public abstract class File<name> {
    String name;
    public File(String name){
        this.name=name;


    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }


    public abstract void display();
}
