package com.three.smbms.pojo;

import java.util.*;

public class Bill {

	private int id;				//����ID
	private String billCode;	//�˵�����
	private String productName;	//��Ʒ����
	private String productDesc;	//��Ʒ����
	private String productUnit;	//��Ʒ��λ
	private String productCount;//��Ʒ����
	private String totalPrice;	//��Ʒ�ܶ�
	private int isPayment;		//�Ƿ�֧����1��δ֧�� 2����֧����
	private String createdBy;	//�����ߣ�userId��
	private Date creationDate;	//����ʱ��
	private String modifyBy;	//�����ߣ�userId��
	private Date modifyDate;	//����ʱ��
	private int providerId;		//��Ӧ��ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public String getProductCount() {
		return productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getIsPayment() {
		return isPayment;
	}
	public void setIsPayment(int isPayment) {
		this.isPayment = isPayment;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	
	
}
