package chapt03.sample1;

import java.lang.reflect.Method;

import org.springframework.util.StopWatch;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		String methodName = method.getName();
		StopWatch sw = new StopWatch();
		
		sw.start(methodName);
		
		System.out.println("[로그] 메소드명 : " + methodName + " 이 불려졌네요.");
		Object rtObject = proxy.invoke(obj, args);
		
		sw.stop();
		System.out.println("[로그] 메소드명 : " + methodName + " 호출 끝났네요");
		System.out.println("[로그] 처리시간 : " + sw.getTotalTimeMillis() + " ms");
		
		return rtObject;
	}

}
