package ws.service;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import ws.exception.OrderWSException;
import ws.inmemory.MemoryData;
import ws.model.Order;

@WebService(endpointInterface = "ws.service.OrderWS")

public class OrderWSImpl implements OrderWS {
	
	//WebserviceContext objesini Resource annotation'u ile inject ediyoruz
	@Resource
	private WebServiceContext wsContext;

	@Override
	public Order getOrder(String id) throws OrderWSException {
		AuthenticateService.authenticate(wsContext);
		//true dönerse iþleme devam edilir ve Order return edilir.
		return MemoryData.getOrder(id);
	}

	@Override
	public Order[] getOrders() throws OrderWSException {
		AuthenticateService.authenticate(wsContext);
		//ayný sekilde
		return MemoryData.getOrdersArrays();
	}

}
