package sample2;

import sample2.MessageBean;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	
	private Outputter outputter;
	
	public MessageBeanImpl(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		String message = greeting + name + " !";
		System.out.println(message);
		try {
			outputter.output(message);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}
}
