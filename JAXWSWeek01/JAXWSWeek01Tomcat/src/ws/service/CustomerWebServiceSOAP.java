package ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import domain.Customer;

@WebService
@SOAPBinding(style=Style.RPC)
public interface CustomerWebServiceSOAP {

	@WebMethod
	public void insertCustomerInfo(@WebParam(name="customer") Customer customer);          //parametre olarak nesne aldý
	
	@WebMethod
	public Customer getCustomer(@WebParam(name="name")String name);							//string parameter
}
