package com.EntityClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Parent {
	
	@Id
	private int parentMob; // Mathch parent and student mob for view parent
	private String parentAddress;
	private int parentPincode;
	private String parentCity;
	private String parentEmail;
	private String parentType; //Dropdown
	public int getParentMob() {
		return parentMob;
	}
	public void setParentMob(int parentMob2) {
		this.parentMob = parentMob2;
	}
	public String getParentAddress() {
		return parentAddress;
	}
	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}
	public int getParentPincode() {
		return parentPincode;
	}
	public void setParentPincode(int parentPincode) {
		this.parentPincode = parentPincode;
	}
	public String getParentCity() {
		return parentCity;
	}
	public void setParentCity(String parentCity) {
		this.parentCity = parentCity;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	public String getParentType() {
		return parentType;
	}
	public void setParentType(String parentType) {
		this.parentType = parentType;
	}
	public Parent(int parentMob, String parentAddress, int parentPincode, String parentCity, String parentEmail,
			String parentType) {
		super();
		this.parentMob = parentMob;
		this.parentAddress = parentAddress;
		this.parentPincode = parentPincode;
		this.parentCity = parentCity;
		this.parentEmail = parentEmail;
		this.parentType = parentType;
	}
	@Override
	public String toString() {
		return "Parent [parentMob=" + parentMob + ", parentAddress=" + parentAddress + ", parentPincode="
				+ parentPincode + ", parentCity=" + parentCity + ", parentEmail=" + parentEmail + ", parentType="
				+ parentType + "]";
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
