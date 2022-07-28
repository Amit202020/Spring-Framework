package pp;

public class Employee {
	
	private String empId;
	private String empName;
	private String empDesc;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		System.out.println("setter callled");
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("setter callled");
		this.empName = empName;
	}
	public String getEmpDesc() {
		return empDesc;
	}
	public void setEmpDesc(String empDesc) {
		System.out.println("setter callled");
		this.empDesc = empDesc;
	}
	public Employee() {
		super();
	}
	
	

}
