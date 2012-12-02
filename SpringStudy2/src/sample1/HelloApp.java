package sample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/sample1/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		MessageBean bean = (MessageBean)factory.getBean("messageBean");
		bean.sayHello();
	}

}
