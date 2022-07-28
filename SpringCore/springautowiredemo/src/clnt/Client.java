package clnt;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Bus;
import com.Car;

public class Client {
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	  ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring3.xml");
      Car c=(Car)ac.getBean("c");
      c.show();
			
	}
}
