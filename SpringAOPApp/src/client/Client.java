package client;

import org.springframework.aop.framework.ProxyFactoryBean;

import service.LogDemo;
import business.AccountNotFoundException;
import business.Bank;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bank b=new Bank();//target
		
		LogDemo ls=new LogDemo();//advice
		
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(ls);
		
		Bank b1=(Bank)pfb.getObject();
	    try {
			int amt=b1.deposit(1000, "HDFC12");
			System.out.println("CLIENT : Total Amount="+amt);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
