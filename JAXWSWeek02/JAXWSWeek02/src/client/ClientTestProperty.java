package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;
//bu ikinci y�ntem
public class ClientTestProperty {
	public static void main(String[] args) throws MalformedURLException {
		
		//property ekledigimizde soap mesajlarini trace edebilirz. SOAP mesajlar�n� console'da g�r�yoruz
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		
		
		String wsdlURL="http://localhost:1234/mywebservice/trace";         //burada publish ettigimiz port numaras�n� kullan�yoruz
		URL url=new URL(wsdlURL);
		
		QName qName=new QName("http://service/", "TraceWriterImplService");
		
		Service service=Service.create(url,qName);
		
		TraceWriter traceWriter=service.getPort(TraceWriter.class);
		
		System.out.println(traceWriter.getMessage());
	}
}

//Ama�: giden gelen mesajlar� trace edebilmek.(izleyebilmek)

//Client'� �al��t�rd�ktan sonra TCP/IP monit�r� a�t�g�m�zda giden gelen mesajalr� g�rebiliyoruz

