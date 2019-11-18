/**
 * 
 */
package com.sourcecode.designpatterns;

/**
 * @author saifahmad
 *
 */
public class EmailMessageService implements MessageService {

	@Override
	public void sendMessage(String msg, String recipient) {
		// TODO Auto-generated method stub
		
		System.out.println("Sending email to <" + recipient + "> for \n[" + msg + "]");

	}

}