package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;
//bu birinci y�ntem
public class ClientTest {
	public static void main(String[] args) throws MalformedURLException {
		
		String wsdlURL="http://localhost:8082/mywebservice/trace";         //tcp/ip monitoring yap�g�m�z portu yaz�yoruz. 8082'yi yani. 1234 yerine
		//URL olusturup ilgili linki verdik.
		URL url=new URL(wsdlURL);
		
		//sonras�nda QName olusturuyoruz
		QName qName=new QName("http://service/", "TraceWriterImplService");
		
		//servis olusturuyoruz
		Service service=Service.create(url,qName);
		
		TraceWriter traceWriter=service.getPort(TraceWriter.class);
		
		System.out.println(traceWriter.getMessage());
	}
}

//Ama�: giden gelen mesajlar� trace edebilmek.(izleyebilmek)

//Client'� �al��t�rd�ktan sonra TCP/IP monit�r� a�t�g�m�zda giden gelen mesajalr� g�rebiliyoruz

//Bir ba�ka yakla���m olan property ile de bu i�lemi yapabiliyoruz.