package member.Kristen.pattern.Composite;

public class clientt {
    public static void main(String[] args) {
        Folder folder=new Folder("CodeFolder");
        Java java=new Java("test.java");
        Cpp cpp=new Cpp("test.cpp");
        Python python=new Python("test.py");

        folder.addFiles(java);
        folder.addFiles(cpp);
        folder.addFiles(python);

        folder.display();

    }

}
