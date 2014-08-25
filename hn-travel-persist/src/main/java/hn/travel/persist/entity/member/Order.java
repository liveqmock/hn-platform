package hn.travel.persist.entity.member;

import hn.travel.persist.entity.IdEntity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 订单表
 * 
 * @author YangYang
 * @date 2014-8-17
 * 
 */
@Entity
@Table(name = "order")
public class Order extends IdEntity {
	private Long userId;
	private double amount;
	private int quantity;
	private Long orderAddrId;
	private String orderMsg;
	private Long expressId;
	private Integer state;
	private Date createTime;
	private Date modifyTime;

	public Order() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getOrderAddrId() {
		return orderAddrId;
	}

	public void setOrderAddrId(Long orderAddrId) {
		this.orderAddrId = orderAddrId;
	}

	public String getOrderMsg() {
		return orderMsg;
	}

	public void setOrderMsg(String orderMsg) {
		this.orderMsg = orderMsg;
	}

	public Long getExpressId() {
		return expressId;
	}

	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
