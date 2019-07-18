package member.scy.designPatterns.spring.factory;

import member.scy.designPatterns.spring.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: hscode
 * @description: 工厂测试类
 * @author: shichengyu
 * @create: 2019-07-17 21:33
 **/
/*
* Component 注解用于把类提交给spring管理
* */
@Component
public class OrderStateMethodConfiguration {

    private Map<String, OrderStatusService> orderStatusServiceHashMap = new HashMap<>();

    @Autowired
    private List<OrderStatusService> orderStatusServices;

    /** 
    * @Description: java8新特性 遍历list
    * @Param: []
    * @return: void 
    * @Author: shichengyu 
    * @Date:2019/7/17 21:35
    */ 
    @PostConstruct
    public void init() {
        orderStatusServices.forEach(orderStatusService ->
                orderStatusServiceHashMap.put(orderStatusService.getType(),orderStatusService));
    }

    public OrderStatusService getLoanStatusService(String orderState){
        return orderStatusServiceHashMap.get(orderState);
    }

}
