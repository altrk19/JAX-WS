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
		
		//d�ng� ile listenin i�inde aray�p equal olan� d�nebiliriz ve ya veritaban�ndan �ekebiliriz. java8 deki predicate ile yazal�m
		return list.stream().filter(e->e.getName().equals(name)).findAny().orElse(null);      //ayn� ise name d�ner degilse null d�ner
	}

}


//projenin konf�g�rasyon ayarlar� web.xml ve sun-jaxws.xml i�erisinde yap�ld�. Bunlar olmak zorunda. /customerServiceWS  linki burada verildi

//http://localhost:8080/JAXWSWeek01Tomcat/customerServiceWS        linke gitti�imizde servisleri g�rebiliyoruz