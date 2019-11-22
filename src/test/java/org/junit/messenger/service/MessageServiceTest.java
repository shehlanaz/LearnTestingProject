package org.junit.messenger.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.messenger.database.DatabaseClass;
import org.messenger.model.Message;
import org.messenger.service.MessageService;

public class MessageServiceTest {

	MessageService messageService = new MessageService();;
	
	@Test
	public void addMessageTest() {
		DatabaseClass.cleanDatabase();
		Message message = new Message();
		message.setMessage("Hello addMessageTest");
		Message returnedMessage = messageService.addMessage(message);
		assertEquals(message, returnedMessage);

	}
	
	@Test
	public void getMessageTest() {
		DatabaseClass.cleanDatabase();
		Message message = new Message();
		message.setId(10);
		message.setMessage("Hello getMessageTest");
		messageService.addMessage(message);
		Message returnedMessage = messageService.getMessage(10);
		assertEquals(message, returnedMessage);

	}
}
