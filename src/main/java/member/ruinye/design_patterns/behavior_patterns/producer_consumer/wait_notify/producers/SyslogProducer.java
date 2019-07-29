package member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify.producers;

import member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify.Log;

import java.io.*;

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

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
