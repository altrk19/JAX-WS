package publisher;

import org.apache.cxf.frontend.ServerFactoryBean;

import service.HelloMyService;
import service.HelloMyServiceImpl;

public class CXFPublisher {

	public static void main(String[] args) {
		String address="http://localhost:1453/hello.cxf";
		
		ServerFactoryBean factory=new ServerFactoryBean();
		HelloMyServiceImpl helloService=new HelloMyServiceImpl();
		
		factory.setServiceClass(HelloMyService.class);
		factory.setAddress(address);
		factory.setServiceBean(helloService);
		factory.create();
		
		System.out.println("CXF Web Service is publishing.");

	}

}


//Apache CXF, JAX-WS implementation'ýdýr         cxf : celtic xfire

//http://localhost:1453/hello.cxf
//http://localhost:1453/hello.cxf?wsdl