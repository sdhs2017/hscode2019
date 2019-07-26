package member.ruinye.design_patterns.creative_patterns.singleton;

public enum LoadResources {

    INSTANCE;

    private Resources resources;

    // 私有构造方法
    private LoadResources(){
        resources = new Resources();
        resources.setEs_bulk(1);
        resources.setEs_ip("192.168.2.182");
        resources.setJdbcProperties(JdbcProperties.getInstance());
    }

    public Resources getResources(){
        return resources;
    }
}
