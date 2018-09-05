package ws.publisher;

import javax.xml.ws.Endpoint;

import ws.service.OrderWSImpl;

public class WebServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/myService/orderws", new OrderWSImpl());
		System.out.println("WebServicePublisher is starting....");
	}
}
// http://localhost:8080/myService/orderws?wsdl


//
//ilk �nce authantica �al���yor true d�nerse kod �al��maya devam ediyor.
//authanticate , token mant�g� benzer seyler