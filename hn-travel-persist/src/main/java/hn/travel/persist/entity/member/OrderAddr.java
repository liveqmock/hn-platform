package hn.travel.persist.entity.member;

import hn.travel.persist.entity.IdEntity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 收货地址表
 * 
 * @author YangYang
 * @date 2014-8-17
 * 
 */
@Entity
@Table(name = "order_addr")
public class OrderAddr extends IdEntity{
	private Long userId;
	private Long consigneeName;
	private String addr;
	private Long mobile;
	private String phone;
	private String postcode;
	private String bestTime;
	private String landmark;
	private Integer state;
	private Date createTime;
	private Date modifyTime;

	public OrderAddr() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(Long consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getBestTime() {
		return bestTime;
	}

	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
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
