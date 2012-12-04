package chapt03.sample1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("chapt03/sample1/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		MessageBean bean = (MessageBean)factory.getBean("proxy");
		bean.sayHello();
	}
}
