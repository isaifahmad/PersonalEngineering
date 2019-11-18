/**
 * 
 */
package com.sourcecode.designpatterns;

/**
 * @author saifahmad
 *
 */
public class SmsMessageService implements MessageService {

	@Override
	public void sendMessage(String msg, String recipient) {
		// TODO Auto-generated method stub
		
		System.out.println("Sending SMS on <" + recipient + "> for\n[" + msg + "]");

	}

}
