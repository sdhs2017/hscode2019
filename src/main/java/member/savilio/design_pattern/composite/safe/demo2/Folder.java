package member.savilio.design_pattern.composite.safe.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 安全模式
 * 容器组件：文件夹
 */
public class Folder implements AbstractFile{

    private String name;

    // 定义容器，用来存储叶子节点  也就是存储文件
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        super();
        this.name = name;
    }

    /**
     * add file
     * @param file
     */
    public void add(AbstractFile file){
        list.add(file);
    }

    /**
     * remove file
     * @param file
     */
    public void remove(AbstractFile file){
        list.remove(file);
    }

    /**
     * 获取该目录下 文件和文件夹
//     * @param index
     * @return
     */
//    public AbstractFile getChild(int index){
//        return list.get(index);
//    }
    public List<AbstractFile> getChild(){
        return list;
    }


    @Override
    public void operiation() {
        System.out.println("处理:"+name+"文件夹");
        if(this.list!=null){
            for (AbstractFile file : list) {
                file.operiation();
            }
        }

    }
}
