package pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext   ac=new ClassPathXmlApplicationContext("resources/spring4.xml");
		
		Car  obj = (Car) ac.getBean("c");
		
		System.out.println(obj);

	}

}
