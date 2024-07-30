package com.EntityClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class LG {

	@Id
	private int lgId;
	private String lgName;
	private String lgEmail;
	private String lgPassword;
	private String lgQualification;
	private String lgYear;
	private String lgDiv;
	private String lgPRNFrom;
	private String lgPRNTo;
	
	
	public LG(int lgId, String lgName, String lgEmail, String lgPassword, String lgQualification, String lgYear,
			String lgDiv, String lgPRNFrom, String lgPRNTo) {
		super();
		this.lgId = lgId;
		this.lgName = lgName;
		this.lgEmail = lgEmail;
		this.lgPassword = lgPassword;
		this.lgQualification = lgQualification;
		this.lgYear = lgYear;
		this.lgDiv = lgDiv;
		this.lgPRNFrom = lgPRNFrom;
		this.lgPRNTo = lgPRNTo;
	}
	public String getLgYear() {
		return lgYear;
	}
	public void setLgYear(String lgYear) {
		this.lgYear = lgYear;
	}
	public String getLgDiv() {
		return lgDiv;
	}
	public void setLgDiv(String lgDiv) {
		this.lgDiv = lgDiv;
	}
	public String getLgPRNFrom() {
		return lgPRNFrom;
	}
	public void setLgPRNFrom(String lgPRNFrom) {
		this.lgPRNFrom = lgPRNFrom;
	}
	public String getLgPRNTo() {
		return lgPRNTo;
	}
	public void setLgPRNTo(String lgPRNTo) {
		this.lgPRNTo = lgPRNTo;
	}
	public int getLgId() {
		return lgId;
	}
	public void setLgId(int lgId) {
		this.lgId = lgId;
	}
	public String getLgName() {
		return lgName;
	}
	public void setLgName(String lgName) {
		this.lgName = lgName;
	}
	public String getLgEmail() {
		return lgEmail;
	}
	public void setLgEmail(String lgEmail) {
		this.lgEmail = lgEmail;
	}
	public String getLgPassword() {
		return lgPassword;
	}
	public void setLgPassword(String lgPassword) {
		this.lgPassword = lgPassword;
	}
	public String getLgQualification() {
		return lgQualification;
	}
	public void setLgQualification(String lgQualification) {
		this.lgQualification = lgQualification;
	}
	@Override
	public String toString() {
		return "LG [lgId=" + lgId + ", lgName=" + lgName + ", lgEmail=" + lgEmail + ", lgPassword=" + lgPassword
				+ ", lgQualification=" + lgQualification + ", lgYear=" + lgYear + ", lgDiv=" + lgDiv + ", lgPRNFrom="
				+ lgPRNFrom + ", lgPRNTo=" + lgPRNTo + "]";
	}
	public LG() {
		super();
		// TODO Auto-generated constructor stub
	}
}
