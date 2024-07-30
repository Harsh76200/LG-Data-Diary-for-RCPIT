package com.EntityClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Student {
	
	@Id
	private int PRN;
	private String stuName;
	private String stuBranch;//DropDown
	private String stuYear;//DropDown
	private String stuDiv;//DropDown
	private String stuAddmissionYear;
	private String stuLg;
	private String stuAge;
	private String stuMob;
	private String stuCgpa;
	private String stuDob;
	private String stuGender; //DropDown
	private String stuCurrAddress;
	private String stuPerAddress;
	private String stuEmail;
	private String stuPass;
	private String stuHostel;//DropDown
	private String stuAadhar;
	private String stuReligion;
	private String stuParentMob;
	public int getPRN() {
		return PRN;
	}
	public void setPRN(int pRN) {
		PRN = pRN;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	public void setStuBranch(String stuBranch) {
		this.stuBranch = stuBranch;
	}
	public String getStuYear() {
		return stuYear;
	}
	public void setStuYear(String stuYear) {
		this.stuYear = stuYear;
	}
	public String getStuDiv() {
		return stuDiv;
	}
	public void setStuDiv(String stuDiv) {
		this.stuDiv = stuDiv;
	}
	public String getStuAddmissionYear() {
		return stuAddmissionYear;
	}
	public void setStuAddmissionYear(String stuAddmissionYear) {
		this.stuAddmissionYear = stuAddmissionYear;
	}
	public String getStuLg() {
		return stuLg;
	}
	public void setStuLg(String stuLg) {
		this.stuLg = stuLg;
	}
	public String getStuAge() {
		return stuAge;
	}
	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuMob() {
		return stuMob;
	}
	public void setStuMob(String stuMob) {
		this.stuMob = stuMob;
	}
	public String getStuCgpa() {
		return stuCgpa;
	}
	public void setStuCgpa(String stuCgpa) {
		this.stuCgpa = stuCgpa;
	}
	public String getStuDob() {
		return stuDob;
	}
	public void setStuDob(String stuDob) {
		this.stuDob = stuDob;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	public String getStuCurrAddress() {
		return stuCurrAddress;
	}
	public void setStuCurrAddress(String stuCurrAddress) {
		this.stuCurrAddress = stuCurrAddress;
	}
	public String getStuPerAddress() {
		return stuPerAddress;
	}
	public void setStuPerAddress(String stuPerAddress) {
		this.stuPerAddress = stuPerAddress;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	public String getStuPass() {
		return stuPass;
	}
	public void setStuPass(String stuPass) {
		this.stuPass = stuPass;
	}
	public String getStuHostel() {
		return stuHostel;
	}
	public void setStuHostel(String stuHostel) {
		this.stuHostel = stuHostel;
	}
	public String getStuAadhar() {
		return stuAadhar;
	}
	public void setStuAadhar(String stuAadhar) {
		this.stuAadhar = stuAadhar;
	}
	public String getStuReligion() {
		return stuReligion;
	}
	public void setStuReligion(String stuReligion) {
		this.stuReligion = stuReligion;
	}
	public String getStuParentMob() {
		return stuParentMob;
	}
	public void setStuParentMob(String stuParentMob) {
		this.stuParentMob = stuParentMob;
	}
	@Override
	public String toString() {
		return "Student [PRN=" + PRN + ", stuName=" + stuName + ", stuBranch=" + stuBranch + ", stuYear=" + stuYear
				+ ", stuDiv=" + stuDiv + ", stuAddmissionYear=" + stuAddmissionYear + ", stuLg=" + stuLg + ", stuAge="
				+ stuAge + ", stuMob=" + stuMob + ", stuCgpa=" + stuCgpa + ", stuDob=" + stuDob + ", stuGender="
				+ stuGender + ", stuCurrAddress=" + stuCurrAddress + ", stuPerAddress=" + stuPerAddress + ", stuEmail="
				+ stuEmail + ", stuPass=" + stuPass + ", stuHostel=" + stuHostel + ", stuAadhar=" + stuAadhar
				+ ", stuReligion=" + stuReligion + ", stuParentMob=" + stuParentMob + "]";
	}
	public Student(int pRN, String stuName, String stuBranch, String stuYear, String stuDiv, String stuAddmissionYear,
			String stuLg, String stuAge, String stuMob, String stuCgpa, String stuDob, String stuGender,
			String stuCurrAddress, String stuPerAddress, String stuEmail, String stuPass, String stuHostel,
			String stuAadhar, String stuReligion, String stuParentMob) {
		super();
		PRN = pRN;
		this.stuName = stuName;
		this.stuBranch = stuBranch;
		this.stuYear = stuYear;
		this.stuDiv = stuDiv;
		this.stuAddmissionYear = stuAddmissionYear;
		this.stuLg = stuLg;
		this.stuAge = stuAge;
		this.stuMob = stuMob;
		this.stuCgpa = stuCgpa;
		this.stuDob = stuDob;
		this.stuGender = stuGender;
		this.stuCurrAddress = stuCurrAddress;
		this.stuPerAddress = stuPerAddress;
		this.stuEmail = stuEmail;
		this.stuPass = stuPass;
		this.stuHostel = stuHostel;
		this.stuAadhar = stuAadhar;
		this.stuReligion = stuReligion;
		this.stuParentMob = stuParentMob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
