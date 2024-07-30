package com.DaoPack;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.EntityClasses.Parent;


public class ParentDao {
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public ParentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public ParentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Transactional
	public Integer addParent(Parent parent) {
		
		Integer i = (Integer) hibernateTemplate.save(parent);
		return i;
	}

	public Parent viewParent(int parentMob) {
		
		return hibernateTemplate.get(Parent.class, parentMob);
	}
	
	
	@Transactional
	public void updateParent(Parent parent) {
		hibernateTemplate.update(parent);
		
	}

	@Transactional
	public void deleteParent(int parentMob) {
		// TODO Auto-generated method stub
		Parent parent = hibernateTemplate.get(Parent.class, parentMob);
		hibernateTemplate.delete(parent);
	}
}
