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
//ilk önce authantica çalýþýyor true dönerse kod çalýþmaya devam ediyor.
//authanticate , token mantýgý benzer seyler