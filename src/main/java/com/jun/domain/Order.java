package com.jun.domain;

import com.jun.enums.OrderStatusEnum;
import com.jun.enums.PayStatusEnum;

import java.math.BigDecimal;
import java.util.Date;


public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.buyer_name
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String buyerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.buyer_phone
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String buyerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.buyer_address
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String buyerAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.buyer_operid
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private String buyerOperid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_amount
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private BigDecimal orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_status
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pay_status
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.create_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.update_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param orderId the value for order.order_id
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.buyer_name
     *
     * @return the value of order.buyer_name
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.buyer_name
     *
     * @param buyerName the value for order.buyer_name
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.buyer_phone
     *
     * @return the value of order.buyer_phone
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.buyer_phone
     *
     * @param buyerPhone the value for order.buyer_phone
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone == null ? null : buyerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.buyer_address
     *
     * @return the value of order.buyer_address
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.buyer_address
     *
     * @param buyerAddress the value for order.buyer_address
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.buyer_operid
     *
     * @return the value of order.buyer_operid
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public String getBuyerOperid() {
        return buyerOperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.buyer_operid
     *
     * @param buyerOperid the value for order.buyer_operid
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setBuyerOperid(String buyerOperid) {
        this.buyerOperid = buyerOperid == null ? null : buyerOperid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_amount
     *
     * @return the value of order.order_amount
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_amount
     *
     * @param orderAmount the value for order.order_amount
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_status
     *
     * @return the value of order.order_status
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_status
     *
     * @param orderStatus the value for order.order_status
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pay_status
     *
     * @return the value of order.pay_status
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.pay_status
     *
     * @param payStatus the value for order.pay_status
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.create_time
     *
     * @return the value of order.create_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.create_time
     *
     * @param createTime the value for order.create_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.update_time
     *
     * @return the value of order.update_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.update_time
     *
     * @param updateTime the value for order.update_time
     *
     * @mbg.generated Thu Sep 27 09:31:33 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}