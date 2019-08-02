package member.Kristen.pattern.Iterator;
import java.sql.*;

public class PrintNames {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/java-test";

    static final String USER = "root";
    static final String PASS = "7WhsmartHaHa8";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name,age FROM student ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                // 通过字段检索

                NameList.names.add(rs.getString("name"));


            }// 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }


        /**
         * 倒叙打印
         */
        NameList name=new NameList();

        for (Iterator iter = name.getIterator(); iter.hasNext();){
            String thename = (String)iter.next();

            System.out.println("Name : " + thename);
        }

    }
}
