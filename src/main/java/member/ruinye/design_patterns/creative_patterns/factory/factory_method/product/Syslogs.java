package member.ruinye.design_patterns.creative_patterns.factory.factory_method.product;

/**
 * 
 * @author jiyourui
 * 针对syslog实现日志范式化接口
 */
public class Syslogs implements I_Baselog {

	//  属性
    private String type;

    private String des;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

	@Override
	public void sysout(String log) {
		
		System.out.println(log);
	}
}
