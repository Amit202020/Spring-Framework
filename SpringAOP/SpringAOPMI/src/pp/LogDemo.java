package pp;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.cglib.proxy.MethodProxy;

public class LogDemo implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("before deposit");

		Object t = arg0.proceed();

		l.info("after deposit");

		return t;
	}

}
