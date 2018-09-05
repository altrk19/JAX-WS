package test;

import net.webservicex.Airport;
import net.webservicex.AirportSoap;

public class TestAirportWebService {

	public static void main(String[] args) {
		Airport airport=new Airport();
		AirportSoap airportSoap=airport.getAirportSoap();
		
		String IST=airportSoap.getAirportInformationByAirportCode("IST");
		System.out.println(IST);
		
		String ANKARA_ESENBOGA = airportSoap.getAirportInformationByCityOrAirportName("ANKARA ESENBOGA");
		System.out.println(ANKARA_ESENBOGA);
		//
		String TURKEY = airportSoap.getAirportInformationByCountry("TURKEY");
		System.out.println(TURKEY);
	}

}
//wsdl linkinden wsimport ile java sýnýuflarýmýzý olusturabiliyoruz.

//http://www.webservicex.net/airport.asmx?wsdl
//wsimport -keep -verbose http://www.webservicex.net/airport.asmx?wsdl