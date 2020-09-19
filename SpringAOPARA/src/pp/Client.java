package pp;

import org.springframework.aop.framework.ProxyFactoryBean;

public class Client {

	public static void main(String[] args) {
		
		   Bank     b  = new Bank() ;   // business

          LogDemo    ls  = new  LogDemo();  // service

           ProxyFactoryBean   pfb = new ProxyFactoryBean();   // proxy
           pfb.setTarget(b);
           pfb.addAdvice(ls);
           Bank  proxy = (Bank) pfb.getObject();

           int amt =proxy.deposit(2300,"sbi12345");
           System.out.println("Total Amount is="+amt);


	}

}
