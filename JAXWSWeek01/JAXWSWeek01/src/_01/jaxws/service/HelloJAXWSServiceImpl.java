package _01.jaxws.service;

import javax.jws.WebService;

//Bu s�n�f SIB(Service Implementation Bean) olarak ge�mektedir.
@WebService(endpointInterface="_01.jaxws.service.HelloJAXWSService")
public class HelloJAXWSServiceImpl implements HelloJAXWSService {

	@Override
	public int calculateSum(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public String getToken(String key) {
		return key.substring(0, 5)+"random";
	}
	
	
}
