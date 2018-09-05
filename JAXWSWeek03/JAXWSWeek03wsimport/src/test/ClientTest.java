package test;

import ws.service.MessageWriter;
import ws.service.MessageWriterImplService;

public class ClientTest {

	public static void main(String[] args) {
		MessageWriterImplService service=new MessageWriterImplService();
		MessageWriter messageWriter=service.getMessageWriterImplPort();
		
		String message=messageWriter.getWelcomeMessage("ali", "bey");
		System.out.println(message);
	}

}
