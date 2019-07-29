package member.ruinye.design_patterns.structural_patterns.proxy;

/**
 * 公共接口
 */
public interface I_EsRestful {

    // 获取es中index的信息
    public String getEsIndexInfo(String curl);
}
