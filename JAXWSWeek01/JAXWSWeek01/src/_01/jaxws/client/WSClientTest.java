package _01.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import _01.jaxws.service.HelloJAXWSService;

public class WSClientTest {

	public static void main(String[] args) throws MalformedURLException {
		String address="http://localhost:1234/mywebservice/hello.service";
		URL url=new URL(address);
		//1)URL objesini olusturduk
		
		QName qName=new QName("http://service.jaxws._01/","HelloJAXWSServiceImplService");
		//2)QName objesi olusturduk
		Service service=Service.create(url,qName);
		//targetNameSpace olusturulurken package name'i tersten yazýlýr.
		//name, SIB (HelloJAWWSServiceImpl), sonuna "Service" eki ekler.
		
		//targetNamespace="http://service.jaxws._01
		//name="HelloJAXWSServiceImplService"
		
		//3)SEI olusturduk
		HelloJAXWSService helloJAXWSService=service.getPort(HelloJAXWSService.class);
		//4)istekte bulunduk (call ws)
		int total=helloJAXWSService.calculateSum(15, 70);       //toplama iþlemi yapýlýr
		System.out.println(total);
	}
	
	
	
}
