package com;

public class Employee {
	
	private int empId;
	private String empName;
	private String empDesc;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String empDesc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesc = empDesc;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesc() {
		return empDesc;
	}
	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesc=" + empDesc + "]";
	}
	
	
	

}
