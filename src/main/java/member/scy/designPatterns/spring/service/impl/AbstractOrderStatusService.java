package member.scy.designPatterns.spring.service.impl;

import member.scy.designPatterns.spring.service.OrderStatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: hscode
 * @description: 抽象类实现接口
 * @author: shichengyu
 * @create: 2019-07-17 21:21
 **/
@Service
public abstract class AbstractOrderStatusService implements OrderStatusService {

    protected static Logger log = LoggerFactory.getLogger(AbstractOrderStatusService.class);

    @Override
    public void orderStatusChange(String orderId) {
        verify(orderId);
        Object obj = new Object();
        buildOrder(obj);
        // 公共业务 如组装数据修改订单表参数,插入订单状态变更轨迹...

        try {
            sendMessage(getMessage(null));
        } catch (Exception e) {
            log.error("update loan status push error: ", e);
        }

    }

    // 用于不同的业务流程可能有特定的数据需要组装
    protected void buildOrder(Object obj){}

    // 业务前的校验
    protected void verify(String orderId){}

    protected void sendMessage(Object obj)  throws Exception{
        if (obj !=null){
            // ....调用接口发送消息
        }
    }

    // 根据业务自行组装消息对象
    protected abstract Object getMessage(Object dto);
}
