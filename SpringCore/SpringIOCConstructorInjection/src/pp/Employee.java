package pp;

public class Employee {

	private int empId;
	private String empName;
	private String empDesc;

	public Employee() {
		super();
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee(int empId, String empName, String empDesc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesc = empDesc;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesc=" + empDesc + "]";
	}

}
