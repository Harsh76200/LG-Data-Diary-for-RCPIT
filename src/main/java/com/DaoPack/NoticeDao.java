package com.DaoPack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.EntityClasses.LG;
import com.EntityClasses.Notice;

public class NoticeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public NoticeDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public NoticeDao() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	@Transactional
	public Integer addNotice(Notice notice)
	{
		Integer i = (Integer) hibernateTemplate.save(notice);
		return i;
	}
	
	 public List<Notice> viewAllNotice() 
	 {
			List<Notice> list =  hibernateTemplate.loadAll(Notice.class);
			return list;
	}
	
	 @Transactional
	 public void deleteNotice(int noticeId) {
			Notice notice = hibernateTemplate.get(Notice.class, noticeId);
			hibernateTemplate.delete(notice);
		}
	
}
