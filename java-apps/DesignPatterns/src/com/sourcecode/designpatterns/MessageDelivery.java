/**
 * 
 */
package com.sourcecode.designpatterns;

/**
 * @author saifahmad
 *
 */
public class MessageDelivery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "New Project Launching on 23rd Nov 2019";
		String recipient = "girish.bindal@proptiger.com";
		String phone = "9089081212";
		
		MessageServiceInjector injector;
		Consumer app;
		
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessage(msg, recipient);
		
		injector = new SmsServiceInjector();
		app = injector.getConsumer();
		app.processMessage(msg, phone);
		
	}

}