package member.ruinye.design_patterns.structural_patterns.proxy;

public class EsRestful_real implements I_EsRestful{
    @Override
    public String getEsIndexInfo(String curl) {

        System.out.println("执行curl命令返回结果");
        return "{'index':'eslog','status':'green'},{'index':'packet','status':'red'}";
    }
}
