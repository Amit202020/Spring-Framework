package pp;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.cglib.proxy.MethodProxy;

public class LogDemo implements ThrowsAdvice {

         public void  afterThrowing(Method m, Object[] a , Object  t, Throwable s) {
        	 Log  l = LogFactory.getLog(Bank.class);
        	 l.info("deposit method created exception");
        	 
         }

}
