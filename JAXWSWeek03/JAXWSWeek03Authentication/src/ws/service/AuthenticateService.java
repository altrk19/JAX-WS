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
		List<String> passList = (List<String>) httpHeaders.get("password");								//header ile gönderilen kullanýcý adý : username, þifre: password

		String username = null;
		String password = null;
		if (userList != null && passList != null) {									//header ile gönderilen liste boþ degilse degiskenlere ata
			username = userList.get(0);
			password = passList.get(0);
		}

		if (!allowedUser.equals(username) || !allowedPassword.equals(password)) {			//bilgiler dogru ise true döner			
			throw new OrderWSException("Error-101", "username or password is invalid!");
		}
		
		return true;

	}

}
//	Amaç authanticate etmek. OrderWSImpl sýnýfýndan çagrýlan  authenticate metotu true dönerse iþleme devam edilir false dönerse exception fýtlatýlýr


// public interface MessageContext extends Map<String, Object>

// Map<String , Map<String,Object>>