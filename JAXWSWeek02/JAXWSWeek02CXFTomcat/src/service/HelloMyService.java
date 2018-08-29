package service;

import javax.jws.WebService;

@WebService
public interface HelloMyService {

	public String getWelcomeMessage(String name, String surname);
}

// Service Endpoint Interface (SEI)
