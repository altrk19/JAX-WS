package ws.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import domain.Customer;

@WebService(endpointInterface="ws.service.CustomerWebServiceSOAP")
public class CustomerWebServiceSOAPImpl implements CustomerWebServiceSOAP {
	
	List<Customer> list=new ArrayList<Customer>();
	
	@Override
	public void insertCustomerInfo(Customer customer) {
		System.out.println("insertCustomerInfo is invoked.");
		System.out.println(customer);
		
		list.add(customer);
	}

	@Override
	public Customer getCustomer(String name) {
		System.out.println("getCustomer is invoked.");
		
		//döngü ile listenin içinde arayýp equal olaný dönebiliriz ve ya veritabanýndan çekebiliriz. java8 deki predicate ile yazalým
		return list.stream().filter(e->e.getName().equals(name)).findAny().orElse(null);      //ayný ise name döner degilse null döner
	}

}


//projenin konfügürasyon ayarlarý web.xml ve sun-jaxws.xml içerisinde yapýldý. Bunlar olmak zorunda. /customerServiceWS  linki burada verildi

//http://localhost:8080/JAXWSWeek01Tomcat/customerServiceWS        linke gittiðimizde servisleri görebiliyoruz