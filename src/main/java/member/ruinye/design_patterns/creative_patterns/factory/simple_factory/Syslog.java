package member.ruinye.design_patterns.creative_patterns.factory.simple_factory;


import member.ruinye.design_patterns.creative_patterns.factory.simple_factory.entity.Syslog_entity;

/**
 * syslog日志范式化
 */
public class Syslog extends Base_Log{

    Syslog_entity sys = new Syslog_entity();
	
    @SuppressWarnings("unchecked")
	@Override
    public Syslog_entity log(String log) {
        
    	sys.setType("syslog");
    	sys.setDes(log);
        
        //System.out.println("范式化syslog日志：日志类型："+type+" 日志内容："+des);
        return sys;
    }
}
