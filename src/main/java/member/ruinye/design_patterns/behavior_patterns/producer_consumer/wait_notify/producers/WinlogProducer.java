package member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify.producers;

import member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify.Log;

public class WinlogProducer implements Runnable{

    private Log log;

    public WinlogProducer(Log log){
        this.log = log;
    }

    @Override
    public void run() {
        while(true){
            String winglosg = "<29> 2019-07-28 00:03:21 JYR-PC 192.168.3.1 Security-Auditing: 4798: 已枚举用户的本地组成员身份。 使用者: 安全 ID: S-1-5-18 帐户名称: JYR-PC$ 帐户域: WORKGROUP 登录 ID: 0x3E7 用户: 安全 ID: S-1-5-21-4171208984-2755532343-4030439117-1000 帐户名称: defaultuser0 帐户域: JYR-PC 进程信息: 进程 ID: 0x3160 进程名称: C:\\Windows\\System32\\svchost.exe";
            log.produce(winglosg);
        }
    }
}
