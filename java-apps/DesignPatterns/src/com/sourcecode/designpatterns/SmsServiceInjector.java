/**
 * 
 */
package com.sourcecode.designpatterns;

/**
 * @author saifahmad
 *
 */
public class SmsServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		SmsMessageService sms = new SmsMessageService();
		return new ConsumerApp(sms);
	}

}
