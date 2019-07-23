package member.savilio.design_pattern.singleton.enumSingleton;

/**
 * 	探索Enum用法
 * @author Savilio
 *
 */
public enum EnumTest {
	
//	private final String host;
//	private final String port;
	
	ConfigurationJDBC("localhost","3306"),
	ConfigurationES("localhost","9200");
	
	private EnumTest(String host, String port) {
		this.host = host;
		this.port = port;
	}
	
	private final String host;
	private final String port;
	public String getHost() {
		return host;
	}
	public String getPort() {
		return port;
	}
	
	@Override
	public String toString() {
		return "Configuration [host=" + host + ", port=" + port + "]";
	}
	
	public static void main(String[] args) {
		EnumTest conf = EnumTest.ConfigurationJDBC;
		System.out.println(conf.toString());
		System.out.println(conf.host);
		System.out.println(conf.port);

		EnumTest conf2 = EnumTest.valueOf(EnumTest.class, "ConfigurationES");
		System.out.println(conf2.toString());
		
		//线程的状态是一个枚举类，可以打印出这6个状态
		Thread.State[] states=Thread.State.values();
		for(int i=0;i<states.length;i++){
			System.out.println(states[i]);
		}
	}

}
