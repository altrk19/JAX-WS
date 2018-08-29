package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.TraceWriter;
//bu birinci yöntem
public class ClientTest {
	public static void main(String[] args) throws MalformedURLException {
		
		String wsdlURL="http://localhost:8082/mywebservice/trace";         //tcp/ip monitoring yapýgýmýz portu yazýyoruz. 8082'yi yani. 1234 yerine
		//URL olusturup ilgili linki verdik.
		URL url=new URL(wsdlURL);
		
		//sonrasýnda QName olusturuyoruz
		QName qName=new QName("http://service/", "TraceWriterImplService");
		
		//servis olusturuyoruz
		Service service=Service.create(url,qName);
		
		TraceWriter traceWriter=service.getPort(TraceWriter.class);
		
		System.out.println(traceWriter.getMessage());
	}
}

//Amaç: giden gelen mesajlarý trace edebilmek.(izleyebilmek)

//Client'ý çalýþtýrdýktan sonra TCP/IP monitörü açtýgýmýzda giden gelen mesajalrý görebiliyoruz

//Bir baþka yaklaþýým olan property ile de bu iþlemi yapabiliyoruz.