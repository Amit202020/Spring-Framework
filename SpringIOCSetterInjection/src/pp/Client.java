package pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext   ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		Employee    emp  =  (Employee) ac.getBean("obj");
		System.out.println(emp.getEmpId()+"/"+emp.getEmpName()+"/"+emp.getEmpDesc());

	}

}
