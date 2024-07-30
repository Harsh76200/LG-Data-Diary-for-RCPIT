package com.DaoPack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.EntityClasses.LG;

public class LGDao {
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;

	public LGDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LGDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	


	@Transactional
	public Integer addNewLg(LG lg) {
		
		Integer i = (Integer) hibernateTemplate.save(lg);
		return i;
	}

	public LG viewOneLg(int lgId) {
		
		return hibernateTemplate.get(LG.class, lgId);
	}
	
   public List<LG> viewAllLg() {
		
		List<LG> list =  hibernateTemplate.loadAll(LG.class);
		return list;
	}
	
	@Transactional
	public void updateLg(LG lgObj) {
		hibernateTemplate.update(lgObj);
		
	}

	@Transactional
	public void deleteLg(int lgId) {
		LG lg = hibernateTemplate.get(LG.class, lgId);
		hibernateTemplate.delete(lg);
	}
	
}
