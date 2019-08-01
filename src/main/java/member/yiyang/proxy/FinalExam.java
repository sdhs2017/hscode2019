package member.yiyang.proxy;

/**
 * 期末考试
 */
public class FinalExam implements IExam{
    private String name;
    public FinalExam(String name){
        this.name = name;
    }
    public void InRoom(){
        System.out.print(name+"进入考场！");
    }
    public void Math(){
        System.out.print("考数学！");
    }
    public void English(){
        System.out.print("考英语！");
    }
}
