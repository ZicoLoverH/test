package com.sr.entity;

import java.security.Timestamp;

/**
 * 菜品类别
 */
public class EpRetailproductsort {
    private Long recKey;
    /**
     * 类别编码
     */
    private String sortId;
    /**
     * \类别名称
     */
    private String sortName;
    private String name;
    private String refSortId;
    private String remark;
    private String timeStamp;
    private Double unitPrice;
    private Double realUnitPrice;
    private Double itemCount;
    private Integer showIndex;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp lastupdate;
    private String lastupdateUserId;
    private Boolean isDeduct;

    public Long getRecKey() {
        return recKey;
    }

    public void setRecKey(Long recKey) {
        this.recKey = recKey;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefSortId() {
        return refSortId;
    }

    public void setRefSortId(String refSortId) {
        this.refSortId = refSortId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getRealUnitPrice() {
        return realUnitPrice;
    }

    public void setRealUnitPrice(Double realUnitPrice) {
        this.realUnitPrice = realUnitPrice;
    }

    public Double getItemCount() {
        return itemCount;
    }

    public void setItemCount(Double itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getLastupdateUserId() {
        return lastupdateUserId;
    }

    public void setLastupdateUserId(String lastupdateUserId) {
        this.lastupdateUserId = lastupdateUserId;
    }

    public Boolean getDeduct() {
        return isDeduct;
    }

    public void setDeduct(Boolean deduct) {
        isDeduct = deduct;
    }
}
