package member.ruinye.design_patterns.creative_patterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String driver = "com.mysql.jdbc.Driver";

    private static final String url = "jdbc:mysql://192.168.3.137:3306/jzLogAnalysis?useUnicode=yes&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";

    private static final String user = "root";

    private static final String passwd = "JZdata.123";

    private static Connection connection = null;

    // 注册驱动
   /* static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/

    // 单例返回数据库连接
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null){
            synchronized (DBConnection.class){
                if (connection == null){
                    Class.forName(driver);
                    connection = DriverManager.getConnection(url,user,passwd);
                }
            }
        }
        return connection;
    }
}
