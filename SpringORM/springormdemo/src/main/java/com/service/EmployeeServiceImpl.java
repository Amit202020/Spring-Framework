package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	
	public void createEmployee(Employee employee) {
		getEmployeeDao().createEmployee(employee);
	}


	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
