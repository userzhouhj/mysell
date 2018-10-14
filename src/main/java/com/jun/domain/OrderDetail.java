package com.jun.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.detail_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String detailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_name
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_price
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private BigDecimal productPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_num
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Integer productNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.product_icon
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String productIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.create_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.update_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.detail_id
     *
     * @return the value of order_detail.detail_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.detail_id
     *
     * @param detailId the value for order_detail.detail_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_id
     *
     * @return the value of order_detail.order_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_id
     *
     * @param orderId the value for order_detail.order_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_id
     *
     * @return the value of order_detail.product_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_id
     *
     * @param productId the value for order_detail.product_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_name
     *
     * @return the value of order_detail.product_name
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_name
     *
     * @param productName the value for order_detail.product_name
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_price
     *
     * @return the value of order_detail.product_price
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_price
     *
     * @param productPrice the value for order_detail.product_price
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_num
     *
     * @return the value of order_detail.product_num
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_num
     *
     * @param productNum the value for order_detail.product_num
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.product_icon
     *
     * @return the value of order_detail.product_icon
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getProductIcon() {
        return productIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.product_icon
     *
     * @param productIcon the value for order_detail.product_icon
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon == null ? null : productIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.create_time
     *
     * @return the value of order_detail.create_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.create_time
     *
     * @param createTime the value for order_detail.create_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.update_time
     *
     * @return the value of order_detail.update_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.update_time
     *
     * @param updateTime the value for order_detail.update_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}