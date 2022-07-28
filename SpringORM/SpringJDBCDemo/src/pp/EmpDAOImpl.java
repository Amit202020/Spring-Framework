package pp;

import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDAOImpl implements EmpDAO {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addEmp(EmpTO emp) {

		String sql = "INSERT INTO emp VALUES(?,?,?)";
		Object[] args = { emp.getEmpId(), emp.getEmpName(), emp.getEmpEmail() };
		int[] argTypes = { Types.INTEGER, Types.VARCHAR, Types.VARCHAR };
		jdbcTemplate.update(sql, args, argTypes);

	}

	@Override
	public void updateEmp(EmpTO emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmpTO findByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpTO> findAllEmp() {
		List<EmpTO> list = null;
		String sql = "SELECT * FROM emp";
		list = jdbcTemplate.query(sql, new EmpRowMapper());
		return list;
	}

}
