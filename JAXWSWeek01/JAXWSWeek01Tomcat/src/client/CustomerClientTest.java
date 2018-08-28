package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import domain.Customer;
import ws.service.CustomerWebServiceSOAP;

public class CustomerClientTest {

	public static void main(String[] args) throws MalformedURLException {

		String address="http://localhost:8080/JAXWSWeek01Tomcat/customerServiceWS";
		URL url=new URL(address);
		QName qname= new QName("http://service.ws/", "CustomerWebServiceSOAPImplService");
		Service service=Service.create(url,qname);
		
		CustomerWebServiceSOAP serviceSoap=service.getPort(CustomerWebServiceSOAP.class);
		
		Customer customer=new Customer("ali","bey",24);
		serviceSoap.insertCustomerInfo(customer);
		
		Customer foundByNameCustomer=serviceSoap.getCustomer("name1");
		System.out.println(foundByNameCustomer);
	}

}
