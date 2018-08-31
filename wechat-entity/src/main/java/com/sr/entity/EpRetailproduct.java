package com.sr.entity;

import java.security.Timestamp;

/**
 * 基础菜品
 */
public class EpRetailproduct {
    private Long recKey;
    /**
     * 单品编码
     */
    private String productId;
    /**
     * 单品名称
     */
    private String productName;
    /**
     * 单品图片
     */
    private String productImg;
    private String name;
    private String sortId;
    private Integer showIndex;
    private Boolean isDeleted;
    private String remark;
    private String unitId;
    /**
     * 单位
     */
    private String unitName;
    private String specifications;
    private String assistUnitId;
    private String assistUnitName;
    private Double assistUnitCount;
    private Boolean isEnable;
    private Double price;
    private Double price1;
    private Double price2;
    private Double price3;
    private Double price4;
    private Boolean isSupply;
    private Boolean isPrompt;
    private String printerName;
    private Double pointGet;
    private Double pointUse;
    private Boolean isPackage;
    private String goodsType;
    private String goodsBarCode;
    private String storageId;
    private String masterSupplierId;
    private String make;
    private String outpacking;
    private Double outpackingValue;
    private String innerpacking;
    private Double innerpackingValue;
    private String singlepacking;
    private Double singlepackingValue;
    private String makepacking;
    private Double conversion;
    private Double produceRate;
    private Double overdue;
    private Double minIndention;
    private Double loadOrder;
    private Double lowestIncomePrice;
    private Double highestIncomePrice;
    private Double newIncomePrice;
    private Double standardCostPrice;
    private Double costPrice;
    private Double producePrice;
    private Double deliverPrice;
    private Double salePrice;
    private String czbz;
    private String tcbz;
    private String checkstate;
    private String stockstate;
    private String sellstate;
    private String usestate;
    private String state;
    private String qhfjzt;
    private String productPass;
    private String isWeight;
    private Double kcxx;
    private String tstc;
    private Boolean isDiscount;
    private String exportClassId;
    private Double kcsx;
    private String produceFlag;
    private String workShopId;
    private String minProValue;
    private Integer mpvconverter;
    private String yxjzt;
    private String mask;
    private String helpcode;
    private String packingType;
    private String transtype;
    private String mbbm;
    private String mbmc;
    private String dhzqval;
    private String dhzqbm;
    private String dhzqmc;
    private Double piecepay;
    private Integer zdsdts;
    private Integer safeday;
    private Double maskValue;
    private Double rcn;
    private Double maskPrice;
    private Double maskPricezz;
    private Double pczdcn;
    private Double pczxcn;
    private Double baseIncomePrice;
    private String cjgbz;
    private String fjbz;
    private String headgoodsid;
    private String workshopid1;
    private String sczqbm;
    private String sczqmc;
    private String sczqval;
    private Integer jhryl;
    private Integer sxts;
    private Integer xxts;
    private Double jxs;
    private Double xxs;
    private String flag;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public Integer getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getAssistUnitId() {
        return assistUnitId;
    }

    public void setAssistUnitId(String assistUnitId) {
        this.assistUnitId = assistUnitId;
    }

    public String getAssistUnitName() {
        return assistUnitName;
    }

    public void setAssistUnitName(String assistUnitName) {
        this.assistUnitName = assistUnitName;
    }

    public Double getAssistUnitCount() {
        return assistUnitCount;
    }

    public void setAssistUnitCount(Double assistUnitCount) {
        this.assistUnitCount = assistUnitCount;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice1() {
        return price1;
    }

    public void setPrice1(Double price1) {
        this.price1 = price1;
    }

    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
    }

    public Double getPrice3() {
        return price3;
    }

    public void setPrice3(Double price3) {
        this.price3 = price3;
    }

    public Double getPrice4() {
        return price4;
    }

    public void setPrice4(Double price4) {
        this.price4 = price4;
    }

    public Boolean getSupply() {
        return isSupply;
    }

    public void setSupply(Boolean supply) {
        isSupply = supply;
    }

    public Boolean getPrompt() {
        return isPrompt;
    }

    public void setPrompt(Boolean prompt) {
        isPrompt = prompt;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public Double getPointGet() {
        return pointGet;
    }

    public void setPointGet(Double pointGet) {
        this.pointGet = pointGet;
    }

    public Double getPointUse() {
        return pointUse;
    }

    public void setPointUse(Double pointUse) {
        this.pointUse = pointUse;
    }

    public Boolean getPackage() {
        return isPackage;
    }

    public void setPackage(Boolean aPackage) {
        isPackage = aPackage;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(String goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getMasterSupplierId() {
        return masterSupplierId;
    }

    public void setMasterSupplierId(String masterSupplierId) {
        this.masterSupplierId = masterSupplierId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getOutpacking() {
        return outpacking;
    }

    public void setOutpacking(String outpacking) {
        this.outpacking = outpacking;
    }

    public Double getOutpackingValue() {
        return outpackingValue;
    }

    public void setOutpackingValue(Double outpackingValue) {
        this.outpackingValue = outpackingValue;
    }

    public String getInnerpacking() {
        return innerpacking;
    }

    public void setInnerpacking(String innerpacking) {
        this.innerpacking = innerpacking;
    }

    public Double getInnerpackingValue() {
        return innerpackingValue;
    }

    public void setInnerpackingValue(Double innerpackingValue) {
        this.innerpackingValue = innerpackingValue;
    }

    public String getSinglepacking() {
        return singlepacking;
    }

    public void setSinglepacking(String singlepacking) {
        this.singlepacking = singlepacking;
    }

    public Double getSinglepackingValue() {
        return singlepackingValue;
    }

    public void setSinglepackingValue(Double singlepackingValue) {
        this.singlepackingValue = singlepackingValue;
    }

    public String getMakepacking() {
        return makepacking;
    }

    public void setMakepacking(String makepacking) {
        this.makepacking = makepacking;
    }

    public Double getConversion() {
        return conversion;
    }

    public void setConversion(Double conversion) {
        this.conversion = conversion;
    }

    public Double getProduceRate() {
        return produceRate;
    }

    public void setProduceRate(Double produceRate) {
        this.produceRate = produceRate;
    }

    public Double getOverdue() {
        return overdue;
    }

    public void setOverdue(Double overdue) {
        this.overdue = overdue;
    }

    public Double getMinIndention() {
        return minIndention;
    }

    public void setMinIndention(Double minIndention) {
        this.minIndention = minIndention;
    }

    public Double getLoadOrder() {
        return loadOrder;
    }

    public void setLoadOrder(Double loadOrder) {
        this.loadOrder = loadOrder;
    }

    public Double getLowestIncomePrice() {
        return lowestIncomePrice;
    }

    public void setLowestIncomePrice(Double lowestIncomePrice) {
        this.lowestIncomePrice = lowestIncomePrice;
    }

    public Double getHighestIncomePrice() {
        return highestIncomePrice;
    }

    public void setHighestIncomePrice(Double highestIncomePrice) {
        this.highestIncomePrice = highestIncomePrice;
    }

    public Double getNewIncomePrice() {
        return newIncomePrice;
    }

    public void setNewIncomePrice(Double newIncomePrice) {
        this.newIncomePrice = newIncomePrice;
    }

    public Double getStandardCostPrice() {
        return standardCostPrice;
    }

    public void setStandardCostPrice(Double standardCostPrice) {
        this.standardCostPrice = standardCostPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getProducePrice() {
        return producePrice;
    }

    public void setProducePrice(Double producePrice) {
        this.producePrice = producePrice;
    }

    public Double getDeliverPrice() {
        return deliverPrice;
    }

    public void setDeliverPrice(Double deliverPrice) {
        this.deliverPrice = deliverPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getCzbz() {
        return czbz;
    }

    public void setCzbz(String czbz) {
        this.czbz = czbz;
    }

    public String getTcbz() {
        return tcbz;
    }

    public void setTcbz(String tcbz) {
        this.tcbz = tcbz;
    }

    public String getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate;
    }

    public String getStockstate() {
        return stockstate;
    }

    public void setStockstate(String stockstate) {
        this.stockstate = stockstate;
    }

    public String getSellstate() {
        return sellstate;
    }

    public void setSellstate(String sellstate) {
        this.sellstate = sellstate;
    }

    public String getUsestate() {
        return usestate;
    }

    public void setUsestate(String usestate) {
        this.usestate = usestate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getQhfjzt() {
        return qhfjzt;
    }

    public void setQhfjzt(String qhfjzt) {
        this.qhfjzt = qhfjzt;
    }

    public String getProductPass() {
        return productPass;
    }

    public void setProductPass(String productPass) {
        this.productPass = productPass;
    }

    public String getIsWeight() {
        return isWeight;
    }

    public void setIsWeight(String isWeight) {
        this.isWeight = isWeight;
    }

    public Double getKcxx() {
        return kcxx;
    }

    public void setKcxx(Double kcxx) {
        this.kcxx = kcxx;
    }

    public String getTstc() {
        return tstc;
    }

    public void setTstc(String tstc) {
        this.tstc = tstc;
    }

    public Boolean getDiscount() {
        return isDiscount;
    }

    public void setDiscount(Boolean discount) {
        isDiscount = discount;
    }

    public String getExportClassId() {
        return exportClassId;
    }

    public void setExportClassId(String exportClassId) {
        this.exportClassId = exportClassId;
    }

    public Double getKcsx() {
        return kcsx;
    }

    public void setKcsx(Double kcsx) {
        this.kcsx = kcsx;
    }

    public String getProduceFlag() {
        return produceFlag;
    }

    public void setProduceFlag(String produceFlag) {
        this.produceFlag = produceFlag;
    }

    public String getWorkShopId() {
        return workShopId;
    }

    public void setWorkShopId(String workShopId) {
        this.workShopId = workShopId;
    }

    public String getMinProValue() {
        return minProValue;
    }

    public void setMinProValue(String minProValue) {
        this.minProValue = minProValue;
    }

    public Integer getMpvconverter() {
        return mpvconverter;
    }

    public void setMpvconverter(Integer mpvconverter) {
        this.mpvconverter = mpvconverter;
    }

    public String getYxjzt() {
        return yxjzt;
    }

    public void setYxjzt(String yxjzt) {
        this.yxjzt = yxjzt;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHelpcode() {
        return helpcode;
    }

    public void setHelpcode(String helpcode) {
        this.helpcode = helpcode;
    }

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getMbbm() {
        return mbbm;
    }

    public void setMbbm(String mbbm) {
        this.mbbm = mbbm;
    }

    public String getMbmc() {
        return mbmc;
    }

    public void setMbmc(String mbmc) {
        this.mbmc = mbmc;
    }

    public String getDhzqval() {
        return dhzqval;
    }

    public void setDhzqval(String dhzqval) {
        this.dhzqval = dhzqval;
    }

    public String getDhzqbm() {
        return dhzqbm;
    }

    public void setDhzqbm(String dhzqbm) {
        this.dhzqbm = dhzqbm;
    }

    public String getDhzqmc() {
        return dhzqmc;
    }

    public void setDhzqmc(String dhzqmc) {
        this.dhzqmc = dhzqmc;
    }

    public Double getPiecepay() {
        return piecepay;
    }

    public void setPiecepay(Double piecepay) {
        this.piecepay = piecepay;
    }

    public Integer getZdsdts() {
        return zdsdts;
    }

    public void setZdsdts(Integer zdsdts) {
        this.zdsdts = zdsdts;
    }

    public Integer getSafeday() {
        return safeday;
    }

    public void setSafeday(Integer safeday) {
        this.safeday = safeday;
    }

    public Double getMaskValue() {
        return maskValue;
    }

    public void setMaskValue(Double maskValue) {
        this.maskValue = maskValue;
    }

    public Double getRcn() {
        return rcn;
    }

    public void setRcn(Double rcn) {
        this.rcn = rcn;
    }

    public Double getMaskPrice() {
        return maskPrice;
    }

    public void setMaskPrice(Double maskPrice) {
        this.maskPrice = maskPrice;
    }

    public Double getMaskPricezz() {
        return maskPricezz;
    }

    public void setMaskPricezz(Double maskPricezz) {
        this.maskPricezz = maskPricezz;
    }

    public Double getPczdcn() {
        return pczdcn;
    }

    public void setPczdcn(Double pczdcn) {
        this.pczdcn = pczdcn;
    }

    public Double getPczxcn() {
        return pczxcn;
    }

    public void setPczxcn(Double pczxcn) {
        this.pczxcn = pczxcn;
    }

    public Double getBaseIncomePrice() {
        return baseIncomePrice;
    }

    public void setBaseIncomePrice(Double baseIncomePrice) {
        this.baseIncomePrice = baseIncomePrice;
    }

    public String getCjgbz() {
        return cjgbz;
    }

    public void setCjgbz(String cjgbz) {
        this.cjgbz = cjgbz;
    }

    public String getFjbz() {
        return fjbz;
    }

    public void setFjbz(String fjbz) {
        this.fjbz = fjbz;
    }

    public String getHeadgoodsid() {
        return headgoodsid;
    }

    public void setHeadgoodsid(String headgoodsid) {
        this.headgoodsid = headgoodsid;
    }

    public String getWorkshopid1() {
        return workshopid1;
    }

    public void setWorkshopid1(String workshopid1) {
        this.workshopid1 = workshopid1;
    }

    public String getSczqbm() {
        return sczqbm;
    }

    public void setSczqbm(String sczqbm) {
        this.sczqbm = sczqbm;
    }

    public String getSczqmc() {
        return sczqmc;
    }

    public void setSczqmc(String sczqmc) {
        this.sczqmc = sczqmc;
    }

    public String getSczqval() {
        return sczqval;
    }

    public void setSczqval(String sczqval) {
        this.sczqval = sczqval;
    }

    public Integer getJhryl() {
        return jhryl;
    }

    public void setJhryl(Integer jhryl) {
        this.jhryl = jhryl;
    }

    public Integer getSxts() {
        return sxts;
    }

    public void setSxts(Integer sxts) {
        this.sxts = sxts;
    }

    public Integer getXxts() {
        return xxts;
    }

    public void setXxts(Integer xxts) {
        this.xxts = xxts;
    }

    public Double getJxs() {
        return jxs;
    }

    public void setJxs(Double jxs) {
        this.jxs = jxs;
    }

    public Double getXxs() {
        return xxs;
    }

    public void setXxs(Double xxs) {
        this.xxs = xxs;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
