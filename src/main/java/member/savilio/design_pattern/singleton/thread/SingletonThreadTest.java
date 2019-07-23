package member.savilio.design_pattern.singleton.thread;


import member.savilio.design_pattern.singleton.early.ConfigurationEarly;
import member.savilio.design_pattern.singleton.lazily.ConfigurationLazy;

/**
 * 多线程验证单例是否线程安全
 * @author Savilio
 *
 */
public class SingletonThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
//		ConfigurationLazy conf;
		
		for(int i=0;i<10;i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
//					ConfigurationEarly.getInstance();
					ConfigurationLazy.getInstance();
//					ConfigurationLazy.getInstance2();
//					ConfigurationLazy.getInstance3();

				}
			}).start();
//			Thread.sleep(200);
		}
	}

}
