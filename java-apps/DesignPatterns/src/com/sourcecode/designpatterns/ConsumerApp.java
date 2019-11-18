/**
 * 
 */
package com.sourcecode.designpatterns;

/**
 * @author saifahmad
 *
 */
public class ConsumerApp implements Consumer {
	
	private MessageService msgService;
	
	ConsumerApp(MessageService obj) {
		this.msgService = obj;
	}

	@Override
	public void processMessage(String msg, String recipient) {
		// TODO Auto-generated method stub
		
		this.msgService.sendMessage(msg, recipient);
		

	}

}
