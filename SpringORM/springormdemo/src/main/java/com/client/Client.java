package com.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			EmployeeService employeeService = ctx.getBean(EmployeeServiceImpl.class);
			createEmployee(employeeService);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ctx != null)
				ctx.close();
		}

	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = getEmployee() ;
		employeeService.createEmployee(employee);
	}
	
	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Amit");
		employee.setEmail("amit@gmail.com");
		employee.setGender("Male");
		employee.setSalary(2000.00);
		return employee;
	}

}
