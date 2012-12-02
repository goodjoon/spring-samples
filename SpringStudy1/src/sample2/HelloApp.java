package sample2;

public class HelloApp {
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanKo();
		bean.sayHello("쭈니쭈니");
		bean = new MessageBeanEn();
		bean.sayHello("쭈니쭈니");
	}
}
