package member.ruinye.design_patterns.creative_patterns.factory.simple_factory;

import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.entity.Winlog_entity;

/**
 * windows日志范式化
 */
public class Winlog extends Base_Log{

    Winlog_entity win = new Winlog_entity();
	
    @SuppressWarnings("unchecked")
	@Override
    public Winlog_entity log(String log) {

    	win.setType("winlog");
    	win.setDes(log);
       // System.out.println("范式化windows日志：日志类型："+type+" 日志内容："+des);
        return win;
    }
}
