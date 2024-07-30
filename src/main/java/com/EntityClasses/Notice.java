package com.EntityClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Notice {
	@Id
	private int noticeId;
	private String noticeDate;
	private String noticeTitle;
	private String noticeDescription;
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notice(int noticeId, String noticeDate, String noticeTitle, String noticeDescription) {
		super();
		this.noticeId = noticeId;
		this.noticeDate = noticeDate;
		this.noticeTitle = noticeTitle;
		this.noticeDescription = noticeDescription;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeDate=" + noticeDate + ", noticeTitle=" + noticeTitle
				+ ", noticeDescription=" + noticeDescription + "]";
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeDescription() {
		return noticeDescription;
	}
	public void setNoticeDescription(String noticeDescription) {
		this.noticeDescription = noticeDescription;
	}
	
	
	

}
