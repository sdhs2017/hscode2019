package member.scy.designPatterns.spring.service.impl;

import org.springframework.stereotype.Service;

/**
 * @program: hscode
 * @description:
 * @author: shichengyu
 * @create: 2019-07-17 21:31
 **/
@Service
public class OrderStatusCloseServiceImpl extends AbstractOrderStatusService {
    @Override
    public String getType() {
        return "close";
    }

    @Override
    protected void buildOrder(Object obj) {
        super.buildOrder(obj);
    }

    @Override
    protected void verify(String orderId) {
        log.info("订单关闭相关数据校验");
    }

    @Override
    protected Object getMessage(Object dto) {
        return null;
    }


}
