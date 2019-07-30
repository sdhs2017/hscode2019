package member.savilio.design_pattern.composite.safe.demo2;

/**
 * 文件系统操作
 */
public class FileSystemOperations {

    public static void main(String[] args) {
        AbstractFile textFile,imageFile,videoFile;
        textFile = new TextFile("readme.txt");
        imageFile = new ImageFile("project.jpg");
        videoFile = new VideoFile("aaa.mp4");
        Folder f = new Folder("c:/tools");
        f.add(videoFile);
        f.add(imageFile);
        f.add(textFile);


        Folder f1 = new Folder("c:/");
        f1.add(videoFile);
        f1.add(videoFile);
        f1.add(imageFile);
        f1.add(f);

        f1.operiation();

        f1.remove(videoFile);
        f.remove(imageFile);
        System.out.println("============");
        f1.operiation();
    }

}
