package publisher;

import javax.xml.ws.Endpoint;

import ws.service.MessageWriterImpl;

public class Publisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/myService/week03", new MessageWriterImpl());
		System.out.println("web service is publishing.");
		//http://localhost:1234/myService/week03?wsdl
		
		//cmd ekran�nda a�a��daki komut yaz�l�r//yeni klas�r a� ad� wsimport olsun
		//wsimport wsimport -keep -verbose http://localhost:1234/myService/week03?wsdl               //art�k java kodunu elde etmi� bulunmaktay�z.
		
		//Her sey yolundaysa .class ve .java dosyalarimiz basarili sekilde olusacaktir. (-keep) parametresini kullanmazsak sadece .class dosyalari olusur)
		//-verbose parametresi compiler�in mesajlarini gosterecektir.
		
		//https://docs.oracle.com/javase/9/tools/wsimport.htm#JSWOR740
		
		
		//uygulamaya JAXWSWeek03wsimport projesinde devam edildi.
	}

}

//!!!!!!!!!!!!!!!!
//wsimport komutu ile wsdl format�ndan java koduna d�n�� yapabiliyoruz.


//wsimport ile wsdl(web service definition language) dosyalarini parse edebiliriz, ilgili JAX-WS /SOAP 
//service�ni kullanmak icin gerekli .java dosyalarini otomatik olarak olusturabiliriz.
