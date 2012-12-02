package sample2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class HelloAppNew {
	public static void main(String[] args) {
		BeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)factory);
//		xmlReader.loadBeanDefinitions(new ClassPathResource("sample2/applicationContext.xml"));
		xmlReader.loadBeanDefinitions("/sample2/applicationContext.xml");
		MessageBean bean = (MessageBean)factory.getBean("messageBean");
		bean.sayHello();
	}
}
