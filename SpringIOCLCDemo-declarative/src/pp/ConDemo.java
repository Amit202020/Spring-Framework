package pp;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ConDemo {

	private String driver;
	private String url;
	private String username;
	private String password;

    Connection con=null;

	
	public void myinit() throws Exception {
		Class.forName(driver);
		con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection created");
	}
	
	public void insertdb() {
		System.out.println("Database insertion");
	}
	
	
	
	
	public void mydestroy() throws Exception {
		con.close();
		System.out.println("Connection destroyed");
		
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
