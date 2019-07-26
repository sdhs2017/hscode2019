package member.ruinye.design_patterns.creative_patterns.singleton;


/**
 * 使用枚举实现单例
 */
public class EnumSingleton {

    private static EnumSingleton enumSingleton = null;

    // 私有构造方法
    private EnumSingleton(){

    }

    // 获得实例
    public static EnumSingleton getInstance(){
        return Singleton.INSYANCE.getInstance();
    }

    private static enum Singleton{
        INSYANCE;

        private EnumSingleton singleton;

        private Singleton(){
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){




            return singleton;
        }

    }

}
