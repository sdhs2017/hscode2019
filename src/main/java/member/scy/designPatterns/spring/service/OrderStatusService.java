package member.scy.designPatterns.spring.service;

public interface OrderStatusService {
    /**
     * 状态变更业务
     * @param orderId 这个参数正常业务肯定是传一个对象了
     */
    void orderStatusChange(String orderId);

    /**
     * 实例所支持的状态类型
     * @return
     */
    String getType();
}