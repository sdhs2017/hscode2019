package member.ruinye.design_patterns.creative_patterns.factory.simple_factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.entity.Syslog_entity;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.entity.Winlog_entity;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestSimpleFactory {

	
	@Test
	public void test(){
		String syslog_log = "一条syslog日志"; 
		String winlog_log = "一条winlog日志"; 
		
		Base_Log log = SimpleFactory.log("syslog");
		
		Syslog_entity sys = log.log(syslog_log);
		System.out.println("日志范式化结果： 日志类型："+sys.getType()+" 日志内容："+sys.getDes());
		
		Base_Log log1 = SimpleFactory.log("winlog");
		Winlog_entity win = log1.log(winlog_log);
		System.out.println("日志范式化结果： 日志类型："+win.getType()+" 日志内容："+win.getDes());
	}
}
