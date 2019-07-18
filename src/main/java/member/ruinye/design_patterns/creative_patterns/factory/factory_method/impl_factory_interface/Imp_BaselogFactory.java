package member.ruinye.design_patterns.creative_patterns.factory.factory_method.impl_factory_interface;

import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.factory_interface.I_BaselogFactory;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.product.I_Baselog;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.product.Syslogs;
import com.jz.bigdata.components.design_patterns.creative_patterns.factory.factory_method.product.Winlog;

/**
 * 
 * @author jiyourui
 * 工厂接口方法实现
 */
public class Imp_BaselogFactory implements I_BaselogFactory{

	// 根据日志类型范式化创建entity
	@Override
	public I_Baselog CreatEntity(String logtype) {
		
		I_Baselog I_baselog;
		switch (logtype) {
		case "syslog":
			I_baselog = new Syslogs();
			return I_baselog;
		case "winlog":
			I_baselog = new Winlog();
			return I_baselog;
		default:
			break;
		}
		return null;
	}

}
