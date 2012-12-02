package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp2 {
	public static void main(String[] args) {
		ApplicationContext factory = new FileSystemXmlApplicationContext("/bin/sample3/applicationContext2.xml");
		
		MessageBean bean = (MessageBean)factory.getBean("messageBean");
		bean.sayHello();
	}
}
