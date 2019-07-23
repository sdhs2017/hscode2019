package member.savilio.design_pattern.singleton.private_constructor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesTest {
    //volatile
    private volatile Properties configuration = new Properties();

    public static void main(String[] args){
//        Test.init("/hosts.properties");
//        System.out.println(Test.getConfigValue("host_passwd"));

        PropertiesTest t = new PropertiesTest();
        t.init( "/hosts.properties");
        System.out.println(t.getConfigValue("host_passwd"));

    }

    public void init(String address) {
        InputStream is = this.getClass().getResourceAsStream(address);
        if (is != null) {
            try {
                this.configuration.clear();
                this.configuration.load(is);
            } catch (IOException e) {
            } finally {
                try {
                    is.close();
                } catch (Throwable t) {
                }
            }
        }
    }

    public String getConfigValue(String key) {
        return this.configuration.getProperty(key);
    }
}
