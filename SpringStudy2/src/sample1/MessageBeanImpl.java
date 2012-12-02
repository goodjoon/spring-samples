package sample1;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;

	@Override
	public void sayHello() {
		System.out.println(greeting + " " + name + " !");
	}
	
	public MessageBeanImpl(String name) {
		super();
		this.name = name;
	}

	public MessageBeanImpl(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return this.greeting;
	}
	
	

}
