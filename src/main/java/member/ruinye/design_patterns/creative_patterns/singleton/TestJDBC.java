package member.ruinye.design_patterns.creative_patterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJDBC {

    public static void main(String[]args){

        /*Connection con = null;
        try {
            try {
                con = DBConnection.getConnection();
                System.out.println(con);
                con = DBConnection.getConnection();
                System.out.println(con);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        JdbcProperties jdbcProperties = JdbcProperties.getInstance();
        System.out.println(jdbcProperties.getProperty("jdbc.driver"));

        Resources resources =  LoadResources.INSTANCE.getResources();

        System.out.println("elasticsearch批量提交阈值："+resources.getEs_bulk()+"  elasticsearch index："+resources.getEs_name());

        resources.setEs_bulk(2);
        resources.setEs_name("packet-analysis");

        System.out.println("elasticsearch批量提交阈值："+resources.getEs_bulk()+"  elasticsearch index："+resources.getEs_name());

        resources = LoadResources.INSTANCE.getResources();

        System.out.println("elasticsearch批量提交阈值："+resources.getEs_bulk()+"  elasticsearch index："+resources.getEs_name());


    }
}
