package com.sr.entity;

import java.security.Timestamp;

/**
 * 微信门店
 */
public class EpLoc {
    private Long recKey;
    private String timeStamp;
    /**
     * 门店编号
     */
    private String locId;
    /**
     * 门店名称
     */
    private String name;
    /**
     * 门店名称
     */
    private String locName;
    /**
     * 对应门店编号
     */
    private String orgId;
    private String defPb;
    private Integer timezone;
    private String daylight;
    /**
     * 城市
     */
    private String address1;
    /**
     * 自治区
     */
    private String address2;
    /**
     * 区县
     */
    private String address3;
    /**
     * 地址
     */
    private String address4;
    /**
     * 城市编号
     */
    private String cityId;
    private String stateId;
    private String countryId;
    private String postalcode;
    /**
     * 电话
     */
    private String phone;
    private String fax;
    private String storeId;
    private String remark;
    private String prefix;
    private String packId;
    private String sortId;
    private Timestamp createDate;
    private String createUserId;
    private Timestamp lastupdate;
    private String lastupdateUserId;
    /**
     * 配送时间
     */
    private String deliverTime;
    /**
     * 开店时间
     */
    private String openTime;
    /**
     * 闭店时间
     */
    private String endTime;
    /**
     *纬度
     */
    private Double latitude;
    /**
     * 经度
     */
    private Double longitude;
    private String deliveryInterval;
    private String refundRemark;
    /**
     * 门店图片
     */
    private String locImage;

    public Long getRecKey() {
        return recKey;
    }

    public void setRecKey(Long recKey) {
        this.recKey = recKey;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getDefPb() {
        return defPb;
    }

    public void setDefPb(String defPb) {
        this.defPb = defPb;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public String getDaylight() {
        return daylight;
    }

    public void setDaylight(String daylight) {
        this.daylight = daylight;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPackId() {
        return packId;
    }

    public void setPackId(String packId) {
        this.packId = packId;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
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

    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDeliveryInterval() {
        return deliveryInterval;
    }

    public void setDeliveryInterval(String deliveryInterval) {
        this.deliveryInterval = deliveryInterval;
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }

    public String getLocImage() {
        return locImage;
    }

    public void setLocImage(String locImage) {
        this.locImage = locImage;
    }
}
