package member.savilio.design_pattern.composite.safe.demo2;

/**
 * 文本文件
 */
public class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void operiation() {
        System.out.println("文本文件:"+name+" 处理操作");
    }
}