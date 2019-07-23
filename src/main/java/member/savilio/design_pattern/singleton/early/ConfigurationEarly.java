package member.savilio.design_pattern.singleton.early;

/**
 * 
 * early singleton
 * @author Savilio
 *
 */
public class ConfigurationEarly {
	
	private static ConfigurationEarly conf = new ConfigurationEarly();
	private ConfigurationEarly() {
		System.out.println("init......");
	}
	
	public static ConfigurationEarly getInstance() {
		return conf;
	}

}
