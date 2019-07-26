package member.ruinye.design_patterns.creative_patterns.singleton;

public class Resources {

    // 各种属性

    private static String es_ip;

    private static String es_port = "9300";

    private static String es_name = "myElasticsearchCluster";

    private static int es_bulk;

    private static JdbcProperties jdbcProperties;

    public String getEs_ip() {
        return es_ip;
    }

    public void setEs_ip(String es_ip) {
        this.es_ip = es_ip;
    }

    public int getEs_bulk() {
        return es_bulk;
    }

    public void setEs_bulk(int es_bulk) {
        this.es_bulk = es_bulk;
    }

    public JdbcProperties getJdbcProperties() {
        return jdbcProperties;
    }

    public void setJdbcProperties(JdbcProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }

    public String getEs_port() {
        return es_port;
    }

    public void setEs_port(String es_port) {
        Resources.es_port = es_port;
    }

    public String getEs_name() {
        return es_name;
    }

    public void setEs_name(String es_name) {
        Resources.es_name = es_name;
    }
}
