package com.DaoPack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.EntityClasses.LG;
import com.EntityClasses.Leave;

public class LeaveDao {
     
	@Autowired
	private HibernateTemplate  hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public LeaveDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public LeaveDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public Integer addNewLeave(Leave leave) {
		
		Integer i = (Integer) hibernateTemplate.save(leave);
		return i;
	}

	public Leave viewLeave(int PRN) {
		
		return hibernateTemplate.get(Leave.class , PRN);
	}
	
	@Transactional
	public void deleteLeave(int PRN) {
		Leave leave = hibernateTemplate.get(Leave.class,PRN);
		hibernateTemplate.delete(leave);
	}
	
	
	public List<Leave> viewAllLeave() {
			
			List<Leave> list =  hibernateTemplate.loadAll(Leave.class);
			return list;
		}
		
		@Transactional
		public void updateLeave(Leave LeaveObj) {
			hibernateTemplate.update(LeaveObj);
			
		}
}
