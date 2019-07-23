package member.ruinye.design_patterns.creative_patterns.factory.factory_method.factory_interface;

import member.ruinye.design_patterns.creative_patterns.factory.factory_method.product.I_Baselog;

/**
 * @author jiyourui
 * 工厂接口，包含一个抽象方法
 */

public interface I_BaselogFactory {

    public abstract I_Baselog CreatEntity(String logtype) ;

}