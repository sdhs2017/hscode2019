package member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal.producers;

import member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SyslogProducer implements Runnable {

    private Log log;

    public SyslogProducer(Log log){
        this.log = log;
    }
    @Override
    public void run() {
        while(true){

            // 通过读取文件来生产日志
            try (FileReader reader = new FileReader("D:\\tmp\\九州\\syslog.txt");
                 BufferedReader br = new BufferedReader(reader)){

                String line;
                while ((line = br.readLine()) != null) {
                    // 一次读入一行数据
                    log.produce(line);
                    System.out.println(line);
                }

            } catch (IOException | InterruptedException e) {
                System.out.println("syslog日志生产异常");
                e.printStackTrace();
            }
        }
    }

}
