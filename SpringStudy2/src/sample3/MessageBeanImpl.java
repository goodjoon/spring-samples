package sample3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBeanImpl implements MessageBean, BeanNameAware,
		BeanFactoryAware, InitializingBean, DisposableBean {
	
	private String greeting;
	private String beanName;
	private BeanFactory beanFactory;
	
	public MessageBeanImpl() {
		System.out.println("[1] Bean 생성자 실행");
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("[2] setGreeting 메소드 실행");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("[X] 종료 (destroy)");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("[3] After properties Set");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("[4] Set Bean Factory");
		this.beanFactory = beanFactory;
		System.out.println("=> " + beanFactory.getClass());
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("[5] Set Bean Name");
		this.beanName = beanName;
		System.out.println("=> " + beanName);
	}

	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + " !");
	}
	
	public void initMe() {
		System.out.println("[6] 초기화 메소드를 실행");
	}

}
