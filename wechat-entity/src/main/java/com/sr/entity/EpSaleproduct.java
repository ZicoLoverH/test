package com.sr.entity;

import java.security.Timestamp;

/**
 * 售卖单品
 */
public class EpSaleproduct {
    private Long recKey;
    private Long masRecKey;
    private String categoryId;
    private String productId;
    private String productName;
    private Double price;
    private Double outPrice;
    private String helpCode;
    private String unitId;
    private String unitName;
    private String memo;
    private Boolean isSupply;
    private Boolean isShow;
    private Integer showIndex;
    private String printerName;
    private Boolean isMonday;
    private Boolean isTuesday;
    private Boolean isWednesday;
    private Boolean isThursday;
    private Boolean isFriday;
    private Boolean isSaturday;
    private Boolean isSunday;
    private Integer countPerday;
    private Integer countRest;
    private String foreColor;
    private String backColor;
    private String siteId;
    private String sortId;
    private String sortName;
    private Boolean isOutSide;
    private Boolean isPackage;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp lastupdate;
    private String lastupdateUserId;

    public Long getRecKey() {
        return recKey;
    }

    public void setRecKey(Long recKey) {
        this.recKey = recKey;
    }

    public Long getMasRecKey() {
        return masRecKey;
    }

    public void setMasRecKey(Long masRecKey) {
        this.masRecKey = masRecKey;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
