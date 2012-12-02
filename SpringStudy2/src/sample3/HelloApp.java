package sample3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/sample3/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		factory.addBeanPostProcessor(new CustomBeanPostProcessor());
		MessageBean bean = (MessageBean)factory.getBean("messageBean");
		bean.sayHello();
	}
}
