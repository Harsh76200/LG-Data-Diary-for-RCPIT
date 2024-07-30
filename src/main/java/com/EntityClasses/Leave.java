package com.EntityClasses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="LeaveRequest")
@Component
public class Leave {
	
	@Id
	private int PRN;
	private String Name;
	private String Year;
	private String Branch;
	private String leaveFrom;
	private String leaveTo;
	private String Mob;
	private String leaveSubject;
	private String leaveDiscription;
	private String studentSignature;
	private String leaveStatus;
	
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public Leave(int pRN, String name, String year, String branch, String leaveFrom, String leaveTo, String mob,
			String leaveSubject, String leaveDiscription, String studentSignature, String leaveStatus) {
		super();
		PRN = pRN;
		Name = name;
		Year = year;
		Branch = branch;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		Mob = mob;
		this.leaveSubject = leaveSubject;
		this.leaveDiscription = leaveDiscription;
		this.studentSignature = studentSignature;
		this.leaveStatus = leaveStatus;
	}
	public int getPRN() {
		return PRN;
	}
	public void setPRN(int pRN) {
		PRN = pRN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getLeaveFrom() {
		return leaveFrom;
	}
	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}
	public String getLeaveTo() {
		return leaveTo;
	}
	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}
	public String getMob() {
		return Mob;
	}
	public void setMob(String mob) {
		Mob = mob;
	}
	public String getLeaveSubject() {
		return leaveSubject;
	}
	public void setLeaveSubject(String leaveSubject) {
		this.leaveSubject = leaveSubject;
	}
	public String getLeaveDiscription() {
		return leaveDiscription;
	}
	public void setLeaveDiscription(String leaveDiscription) {
		this.leaveDiscription = leaveDiscription;
	}
	public String getStudentSignature() {
		return studentSignature;
	}
	public void setStudentSignature(String studentSignature) {
		this.studentSignature = studentSignature;
	}
	@Override
	public String toString() {
		return "Leave [PRN=" + PRN + ", Name=" + Name + ", Year=" + Year + ", Branch=" + Branch + ", leaveFrom="
				+ leaveFrom + ", leaveTo=" + leaveTo + ", Mob=" + Mob + ", leaveSubject=" + leaveSubject
				+ ", leaveDiscription=" + leaveDiscription + ", studentSignature=" + studentSignature + ", leaveStatus="
				+ leaveStatus + "]";
	}
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
