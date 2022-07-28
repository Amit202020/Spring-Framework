package pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		ConDemo    cc = (ConDemo) ac.getBean("con");
		
		cc.insertdb();
		
		ac.close();

	}

}
