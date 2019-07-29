package member.ruinye.design_patterns.creative_patterns.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class JdbcProperties {

    private Properties properties;

    // 私有构造方法，只允许内部类调用，且初始化的时候不会走该构造方法
    private JdbcProperties(){
        properties = new Properties();
        InputStream in = this.getClass().getResourceAsStream("/jdbc.properties");
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(in, "UTF-8");
            properties.load(inputStreamReader);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e1){

        }
    }



    // 通过获取实例方法调用构造方法
    public static final JdbcProperties getInstance(){
        return JdbcPropertiesHold.jdbcProperties;
    }

    // 通过KEY获取配置内容
    public String getProperty(String key){
        return properties.getProperty(key);
    }

    // 静态内部类
    public static class JdbcPropertiesHold{
        private static JdbcProperties jdbcProperties = new JdbcProperties();
    }
}
