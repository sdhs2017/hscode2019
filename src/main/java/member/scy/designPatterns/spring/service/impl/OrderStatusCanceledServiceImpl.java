package member.scy.designPatterns.spring.service.impl;

import org.springframework.stereotype.Service;

/**
 * @program: hscode
 * @description:
 * @author: shichengyu
 * @create: 2019-07-17 21:30
 **/
@Service
public class OrderStatusCanceledServiceImpl extends AbstractOrderStatusService {

    @Override
    public String getType() {
        return "canceled";
    }

    @Override
    protected void buildOrder(Object obj) {
    }

    @Override
    protected void verify(String orderId) {
        log.info("订单取消相关数据校验");
    }

    @Override
    protected Object getMessage(Object dto) {
        return null;
    }
}
