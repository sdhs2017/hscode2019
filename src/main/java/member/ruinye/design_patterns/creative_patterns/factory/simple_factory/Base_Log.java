package member.ruinye.design_patterns.creative_patterns.factory.simple_factory;

public abstract class Base_Log {

    /**
     * 范式化一条日志
     * @param log
     * @return 日志实例
     */
    public abstract <T> T log(String log);
}
