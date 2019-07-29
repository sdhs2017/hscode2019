package member.ruinye.design_patterns.structural_patterns.proxy;

/**
 * 代理
 */
public class EsRestful_proxy implements I_EsRestful{

    private  I_EsRestful i_esRestful;

    public EsRestful_proxy(I_EsRestful i_esRestful){
        this.i_esRestful = i_esRestful;
    }

    @Override
    public String getEsIndexInfo(String curl) {
        String result = i_esRestful.getEsIndexInfo(curl);
        System.out.println("经过处理后的信息");
        return "{'eslog':'green','packet':'red'}";
    }
}
