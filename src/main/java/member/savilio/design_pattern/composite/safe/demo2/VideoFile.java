package member.savilio.design_pattern.composite.safe.demo2;

/**
 * 视频文件
 */
public class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void operiation() {
        System.out.println("视频文件:"+name+" 处理操作");
    }
}