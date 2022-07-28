package com.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;
	
	public void createEmployee(Employee employee) {
		
		getHibernateTemplate().save(employee);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
