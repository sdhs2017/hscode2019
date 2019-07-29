package member.ruinye.design_patterns.structural_patterns.proxy;

public class TestProxy {

    public static void main(String []args){

        EsRestful_real esRestful_real = new EsRestful_real();

        String result1 = esRestful_real.getEsIndexInfo("curl -X GET http://192.168.2.182:9200/_cat/indices?v");
        System.out.println(result1);

        // 走代理方式
        EsRestful_proxy esRestful_proxy = new EsRestful_proxy(esRestful_real);
        String result2 = esRestful_proxy.getEsIndexInfo("curl -X GET http://192.168.2.182:9200/_cat/indices?v");
        System.out.println(result2);


    }


}
