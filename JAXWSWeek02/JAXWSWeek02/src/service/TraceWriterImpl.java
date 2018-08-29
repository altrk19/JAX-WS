package service;

import javax.jws.WebService;

@WebService(endpointInterface="service.TraceWriter")
public class TraceWriterImpl implements TraceWriter {

	@Override
	public String getMessage() {
		return "TraceWriterImpl #getMessage invoked";
	}

}
