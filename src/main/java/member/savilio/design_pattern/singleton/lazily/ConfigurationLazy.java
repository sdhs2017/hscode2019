package member.savilio.design_pattern.singleton.lazily;


/**
 * lazy singleton
 * @author Savilio
 *
 */
public class ConfigurationLazy {
	
	private static ConfigurationLazy conf = null;
//	private volatile static ConfigurationLazy conf = null;
	private ConfigurationLazy() {
		System.out.println("init......");
	}
	
	public static ConfigurationLazy getInstance() {
		if(null==conf) {
			conf = new ConfigurationLazy();
		}
		return conf;
	}
	
	/**
	 * 局部加锁还是方法上锁
	   但是加了锁之后效率非常低，我们观察，其实只需要在第一次没有创建对象的时候上锁就可以了，当创建对象之后，不需要进行同步。那么我们只需要判断当对象为空的时候，给创建对象代码块加锁就可以了，当对象不为空的时候我们直接返回对象。
	 */
	public static synchronized ConfigurationLazy getInstance2() {
		if(null==conf) {
			conf = new ConfigurationLazy();
		}

		//TODO LIST
		return conf;
	}
	
	/**
		延迟初始化。和懒汉模式一致，只有在初次调用静态方法getSingleton，才会初始化signleton实例。
		性能优化。同步会造成性能下降，在同步前通过判读singleton是否初始化，减少不必要的同步开销。
		线程安全。同步创建Singleton对象，同时注意到静态变量singleton使用volatile修饰。
		
		为什么要使用volatile修饰？
		虽然已经使用synchronized进行同步，但在第4步创建对象时，会有下面的伪代码：
		memory=allocate(); //1：分配内存空间
		ctorInstance();   //2:初始化对象
		singleton=memory; //3:设置singleton指向刚排序的内存空间
		
		volatile禁止重排序
		由于JIT编译器为了提高性能，可能在   singletonInstance = new Singleton();发生重排序，伪代码为：
		
		memory = allocate();   //1：分配对象的内存空间
		ctorInstance(memory);  //2：初始化对象
		instance = memory;     //3：设置instance指向刚分配的内存地址
		
		其中，2和3步骤可能会重排序，2和3得顺序可能会跌倒。所以有这样一种可能，当线程A实例对象时，执行顺序为132，线程B进入代码后看到instance得内存地址认为对象不为null，便返回实例，但是此刻线程A的初始化对象还没有执行，所以返回得是空值。
		解决方案
		
		不允许2和3重排序；
		允许2和3重排序，但不允许其他线程“看到”这个重排序。
		当声明对象的引用为volatile后，“问题的根源”的三行伪代码中的2和3之间的重排序，在多线程环境中将会被禁止。
	 */
	/**
	 * double check
	 * @return
	 */
	public static ConfigurationLazy getInstance3() {
		if(null == conf) {
			synchronized(ConfigurationLazy.class) {
				if(null == conf) {
					conf = new ConfigurationLazy();
				}
			}
		}
		return conf;
	}
	

}
