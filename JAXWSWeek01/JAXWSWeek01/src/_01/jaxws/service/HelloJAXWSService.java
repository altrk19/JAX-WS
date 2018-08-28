package _01.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Bu interface  SEI(Service Endpoint Interface) olarak geçmekte.
@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloJAXWSService {

	@WebMethod
	public int calculateSum(@WebParam(name="number1")int num1,@WebParam(name="number2")int num2);
	
	@WebMethod
	public String getToken(String key);
}
