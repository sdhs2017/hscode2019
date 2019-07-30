package member.savilio.design_pattern.composite.safe.demo2;

/**
 *  图片文件
 */
public class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name){
        super();
        this.name=name;
    }

    @Override
    public void operiation() {
        System.out.println("图片文件:"+name+" 处理操作");
    }
}
