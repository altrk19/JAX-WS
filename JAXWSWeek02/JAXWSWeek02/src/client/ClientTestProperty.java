package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;
//bu ikinci yöntem
public class ClientTestProperty {
	public static void main(String[] args) throws MalformedURLException {
		
		//property ekledigimizde soap mesajlarini trace edebilirz. SOAP mesajlarýný console'da görüyoruz
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		
		
		String wsdlURL="http://localhost:1234/mywebservice/trace";         //burada publish ettigimiz port numarasýný kullanýyoruz
		URL url=new URL(wsdlURL);
		
		QName qName=new QName("http://service/", "TraceWriterImplService");
		
		Service service=Service.create(url,qName);
		
		TraceWriter traceWriter=service.getPort(TraceWriter.class);
		
		System.out.println(traceWriter.getMessage());
	}
}

//Amaç: giden gelen mesajlarý trace edebilmek.(izleyebilmek)

//Client'ý çalýþtýrdýktan sonra TCP/IP monitörü açtýgýmýzda giden gelen mesajalrý görebiliyoruz

