package pp;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext  ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		EmpDAOImpl   ed=(EmpDAOImpl) ac.getBean("obj");
		
		//EmpTO  e=new  EmpTO(13,"nikil","n@g.com");
		
		//ed.addEmp(e);
		List<EmpTO>   list=ed.findAllEmp();
		Iterator  it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
