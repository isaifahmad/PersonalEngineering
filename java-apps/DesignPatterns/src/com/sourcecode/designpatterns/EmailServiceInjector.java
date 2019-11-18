package com.sourcecode.designpatterns;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		EmailMessageService email = new EmailMessageService();
		return new ConsumerApp(email);
	}

}
