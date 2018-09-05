package ws.service;

import javax.jws.WebService;

@WebService(endpointInterface="ws.service.MessageWriter")
public class MessageWriterImpl implements MessageWriter {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "welcome "+name+" "+surname;
	}

}
