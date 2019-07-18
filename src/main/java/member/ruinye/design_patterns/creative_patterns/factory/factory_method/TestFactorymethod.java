/*
package member.ruinye.design_patterns.creative_patterns.factory.factory_method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.factory_interface.I_BaselogFactory;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.impl_factory_interface.Imp_BaselogFactory;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.product.I_Baselog;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.Base_Log;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.SimpleFactory;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.entity.Syslog_entity;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.simple_factory.entity.Winlog_entity;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestFactorymethod {

	@Test
	public void test(){
		
		I_BaselogFactory baselogFactory = new Imp_BaselogFactory();
		I_Baselog baselog;
		
		// 不需要知道具体的实现方式
		baselog = baselogFactory.CreatEntity("syslog");
		baselog.sysout("syslog 日志范式化工作");
		baselog = baselogFactory.CreatEntity("winlog");
		baselog.sysout("winlog 日志范式化工作");
	}
}
*/
