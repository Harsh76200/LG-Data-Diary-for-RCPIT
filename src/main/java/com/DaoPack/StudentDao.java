package com.DaoPack;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.EntityClasses.Student;

public class StudentDao {
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
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
	public Integer addNewStudent(Student student) {
		
		Integer i = (Integer) hibernateTemplate.save(student);
		return i;
	}

	public Student viewOneStudent(int PRN) {
		
		return hibernateTemplate.get(Student.class, PRN);
	}
	
   public List<Student> viewAllStudent() {
		
		List<Student> list =  hibernateTemplate.loadAll(Student.class);
		return list;
	}
	
	@Transactional
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
		
	}

	@Transactional
	public void deleteStudent(int PRN) {
		// TODO Auto-generated method stub
		Student student = hibernateTemplate.get(Student.class, PRN);
		hibernateTemplate.delete(student);
	}
}
