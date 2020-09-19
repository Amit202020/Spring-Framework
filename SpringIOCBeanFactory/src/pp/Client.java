package pp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		Resource   rs = new ClassPathResource("resources/spring.xml");//loading
		BeanFactory  fac  = new XmlBeanFactory(rs);
		
		fac.getBean("obj"); // client request
        fac.getBean("obj"); // client request
		fac.getBean("obj"); // client request

	}

}
