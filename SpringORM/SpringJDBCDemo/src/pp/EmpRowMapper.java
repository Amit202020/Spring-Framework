package pp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper  implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int r) throws SQLException {
		EmpTO  e=new  EmpTO();
		e.setEmpId(rs.getInt(1));
		e.setEmpName(rs.getString(2));
		e.setEmpEmail(rs.getString(3));
		return e;
	}

}
