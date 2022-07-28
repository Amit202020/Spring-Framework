package pp;

import java.util.List;

public interface EmpDAO {
	
	public void addEmp(EmpTO  emp);
	public void updateEmp(EmpTO  emp);
	public void deleteEmp(int  empId);
	public  EmpTO  findByEmpId(int empId);
	public  List<EmpTO> findAllEmp();

}
