package pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext  ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		 Student  st=(Student) ac.getBean("stu");
		 System.out.println(st);
		 
	}

}
