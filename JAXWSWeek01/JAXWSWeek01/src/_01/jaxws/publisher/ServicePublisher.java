package _01.jaxws.publisher;

import javax.xml.ws.Endpoint;

import _01.jaxws.service.HelloJAXWSServiceImpl;

public class ServicePublisher {

	public static void main(String[] args) {
		String address="http://localhost:1234/mywebservice/hello.service";
		Endpoint.publish(address, new HelloJAXWSServiceImpl());
		
		System.out.println("Web service is running");
	}

}

//http://localhost:1234/mywebservice/hello.service?wsdl         wsdl bilgisine ulaþýyoruz