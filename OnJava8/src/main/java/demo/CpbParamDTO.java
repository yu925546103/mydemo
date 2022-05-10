package demo;


import java.io.Serializable;
import java.util.List;

/**
 * Created by fangzp on 2016-12-05.
 */
public class CpbParamDTO extends PageDTO implements Serializable {

    private static final long serialVersionUID = -8738543968835264612L;
    /**
     * 产品包Id
     */
    private String cpbId;
    private String cpbMc;
    /**
     * 产品包简码
     */
    private String jm;
    /**
     * 用途 SELL销售 FREE免费
     */
    private String purpose;
    /**
     * 产品包状态
     */
    private String status;
    /**
     * 产品包版本发布状态
     */
    private String fbzt;
    /**
     * 产品包版本发布状态
     */
    private String nonFbzt;
    /**
     * 产品包模板标志
     */
    private String mbbz;
    /**
     * 使用分子公司
     */
    private String syFzgsDm;
    /**
     * 产品大类代码
     */
    private String cpdlDm;
    /**
     * 标签值id
     */
    private Long tagId;
    /**
     * 标签元id
     */
    private Long tagMetaId;
    /**
     * 标签适用场景数据库表列表
     */
    private List<String> sceneTableList;
    /**
     * 价格起
     */
    private Double priceStart;
    /**
     * 价格止
     */
    private Double priceEnd;
    /**
     * 模板产品包id
     */
    private String jymbCpbId;
    /**
     * 提交发布人代码
     */
    private String tjfbrDm;
    /**
     * 是否设置续费关系
     */
    private String isSzxfgx; //1：需要设置续费关系的产品包
    /**
     * 标签设置状态
     */
    private String szzt;
    /**
     * 产品包存在续费关系
     */
    private String notSetXfgx;  //1：实际没有设置续费关系的产品包
    /**
     * 总公司标志
     */
    private boolean isZgs;
    /**
     * 作废托收协议标志 0不作废，1作废
     */
    private String zftsxybz;
    /**
     * 模糊查询返回数据条数, 如果我空默认40条
     */
    private String count = "40";


    /**
     * 关键字，名称,id或者金额
     */
    private String key;

    /**
     * 具体排序内容
     */
    private String sortContent;
    /**
     * 是否是数字类型
     **/
    private Boolean numberType;
    /**
     * 产品包版本id列表
     **/
    private List<Long> cpbBBIdList;
    /**
     * 是否需要查询总公司产品包
     */
    private boolean needZgsProduct;

    private List<String> fzgsDmList;

    public List<String> getFzgsDmList() {
        return fzgsDmList;
    }

    public void setFzgsDmList(List<String> fzgsDmList) {
        this.fzgsDmList = fzgsDmList;
    }

    public String getCpbId() {
        return cpbId;
    }

    public void setCpbId(String cpbId) {
        this.cpbId = cpbId;
    }

    public String getCpbMc() {
        return cpbMc;
    }

    public void setCpbMc(String cpbMc) {
        this.cpbMc = cpbMc;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFbzt() {
        return fbzt;
    }

    public void setFbzt(String fbzt) {
        this.fbzt = fbzt;
    }

    public String getMbbz() {
        return mbbz;
    }

    public void setMbbz(String mbbz) {
        this.mbbz = mbbz;
    }

    public String getSyFzgsDm() {
        return syFzgsDm;
    }

    public void setSyFzgsDm(String syFzgsDm) {
        this.syFzgsDm = syFzgsDm;
    }

    public String getCpdlDm() {
        return cpdlDm;
    }

    public void setCpdlDm(String cpdlDm) {
        this.cpdlDm = cpdlDm;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTagMetaId() {
        return tagMetaId;
    }

    public void setTagMetaId(Long tagMetaId) {
        this.tagMetaId = tagMetaId;
    }

    public Double getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(Double priceStart) {
        this.priceStart = priceStart;
    }

    public Double getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(Double priceEnd) {
        this.priceEnd = priceEnd;
    }

    public boolean isZgs() {
        return isZgs;
    }

    public void setZgs(boolean zgs) {
        isZgs = zgs;
    }

    public String getSzzt() {
        return szzt;
    }

    public void setSzzt(String szzt) {
        this.szzt = szzt;
    }

    public String getJm() {
        return jm;
    }

    public void setJm(String jm) {
        this.jm = jm;
    }

    public String getTjfbrDm() {
        return tjfbrDm;
    }

    public void setTjfbrDm(String tjfbrDm) {
        this.tjfbrDm = tjfbrDm;
    }

    public String getIsSzxfgx() {
        return isSzxfgx;
    }

    public void setIsSzxfgx(String isSzxfgx) {
        this.isSzxfgx = isSzxfgx;
    }

    public String getZftsxybz() {
        return zftsxybz;
    }

    public void setZftsxybz(String zftsxybz) {
        this.zftsxybz = zftsxybz;
    }

    public String getJymbCpbId() {
        return jymbCpbId;
    }

    public void setJymbCpbId(String jymbCpbId) {
        this.jymbCpbId = jymbCpbId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<String> getSceneTableList() {
        return sceneTableList;
    }

    public void setSceneTableList(List<String> sceneTableList) {
        this.sceneTableList = sceneTableList;
    }

    public String getNotSetXfgx() {
        return notSetXfgx;
    }

    public void setNotSetXfgx(String notSetXfgx) {
        this.notSetXfgx = notSetXfgx;
    }

    public String getNonFbzt() {
        return nonFbzt;
    }

    public void setNonFbzt(String nonFbzt) {
        this.nonFbzt = nonFbzt;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSortContent() {
        return sortContent;
    }

    public void setSortContent(String sortContent) {
        this.sortContent = sortContent;
    }

    public Boolean getNumberType() {
        return numberType;
    }

    public void setNumberType(Boolean numberType) {
        this.numberType = numberType;
    }

    public List<Long> getCpbBBIdList() {
        return cpbBBIdList;
    }

    public void setCpbBBIdList(List<Long> cpbBBIdList) {
        this.cpbBBIdList = cpbBBIdList;
    }

    public boolean isNeedZgsProduct() {
        return needZgsProduct;
    }

    public void setNeedZgsProduct(boolean needZgsProduct) {
        this.needZgsProduct = needZgsProduct;
    }

    public static CpbParamDTO buildQueryCheckCpbParam(String cpbMc, String tjfbrDm, String fzgsDm) {
        CpbParamDTO paramDTO = new CpbParamDTO();
        paramDTO.setCpbMc(cpbMc);
        paramDTO.setTjfbrDm(tjfbrDm);
        paramDTO.setSyFzgsDm(fzgsDm);
        return paramDTO;
    }
}
