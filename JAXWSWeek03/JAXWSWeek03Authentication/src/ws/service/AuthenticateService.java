package ws.service;

import java.util.List;
import java.util.Map;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import ws.exception.OrderWSException;

public class AuthenticateService {

	private static final String allowedUser = "admin";
	private static final String allowedPassword = "12345";

	public static boolean authenticate(WebServiceContext wsContext) throws OrderWSException {
		
		System.out.println("AuthenticateService#authenticate is invoked...");
		MessageContext messageContext = wsContext.getMessageContext();
		//
		Map<String, Object> httpHeaders = (Map<String, Object>) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<String> userList = (List<String>) httpHeaders.get("username");
		List<String> passList = (List<String>) httpHeaders.get("password");								//header ile g�nderilen kullan�c� ad� : username, �ifre: password

		String username = null;
		String password = null;
		if (userList != null && passList != null) {									//header ile g�nderilen liste bo� degilse degiskenlere ata
			username = userList.get(0);
			password = passList.get(0);
		}

		if (!allowedUser.equals(username) || !allowedPassword.equals(password)) {			//bilgiler dogru ise true d�ner			
			throw new OrderWSException("Error-101", "username or password is invalid!");
		}
		
		return true;

	}

}
//	Ama� authanticate etmek. OrderWSImpl s�n�f�ndan �agr�lan  authenticate metotu true d�nerse i�leme devam edilir false d�nerse exception f�tlat�l�r


// public interface MessageContext extends Map<String, Object>

// Map<String , Map<String,Object>>