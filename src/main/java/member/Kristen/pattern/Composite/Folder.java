package member.Kristen.pattern.Composite;
import java.util.ArrayList;
public class Folder extends File {

    private ArrayList<File> files;

    public Folder(String name){
        super(name);
        files=new ArrayList<File>();

    }

    public void addFiles(File file){
        files.add(file);
    }

    public void deleteFiles(File file){
        files.remove(file);
    }

    @Override
    public void display(){
        for(File file: files){
            file.display();
        }
    }
}
