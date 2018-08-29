package publisher;

import javax.xml.ws.Endpoint;

import service.TraceWriterImpl;

public class WebServicePublisher {
	public static void main(String[] args) {
		
		//publish etmek istedigimiz adresi yazıyoruz.bunun için endpoint kullanıyoruz
		String address="http://localhost:1234/mywebservice/trace";
		Endpoint.publish(address, new TraceWriterImpl());
		System.out.println("Web Service is publishing..");
		
		//http://localhost:1234/mywebservice/trace?wsdl
	}

}

//Window -> Preference -> TCP/IP Monitor -> Add -> monitoring port : 8082 , hostname: localhost , port : 1234 , Type : TCP/IP -> Start