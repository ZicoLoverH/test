package com.sr.entity;

import java.security.Timestamp;

/**
 * 系统设置
 */
public class EpAppsetting {
    private Long recKey;
    private String timeStamp;
    private String appCode;
    private String setId;
    private Integer setNo;
    /**
     * 功能名称
     */
    private String setName;
    private String groupFlag;
    private String refSetId;
    private String setFlag;
    private String scFlag;
    private String setString;
    private String refAppCode;
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

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public Integer getSetNo() {
        return setNo;
    }

    public void setSetNo(Integer setNo) {
        this.setNo = setNo;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getGroupFlag() {
        return groupFlag;
    }

    public void setGroupFlag(String groupFlag) {
        this.groupFlag = groupFlag;
    }

    public String getRefSetId() {
        return refSetId;
    }

    public void setRefSetId(String refSetId) {
        this.refSetId = refSetId;
    }

    public String getSetFlag() {
        return setFlag;
    }

    public void setSetFlag(String setFlag) {
        this.setFlag = setFlag;
    }

    public String getScFlag() {
        return scFlag;
    }

    public void setScFlag(String scFlag) {
        this.scFlag = scFlag;
    }

    public String getSetString() {
        return setString;
    }

    public void setSetString(String setString) {
        this.setString = setString;
    }

    public String getRefAppCode() {
        return refAppCode;
    }

    public void setRefAppCode(String refAppCode) {
        this.refAppCode = refAppCode;
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
}
