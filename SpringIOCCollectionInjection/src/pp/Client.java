package pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext  ac= new ClassPathXmlApplicationContext("resources/spring.xml");
		Student   obj = (Student) ac.getBean("stu");
		System.out.println(obj);

	}

	

}
