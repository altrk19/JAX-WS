package ws.service;

import javax.jws.WebService;

@WebService(endpointInterface="ws.service.MessageWriter")
public class MessageWriterImpl implements MessageWriter {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "welcome "+name+" "+surname;
	}

}

//http://localhost:8080/JAXWSWeek03Axis/services
//http://localhost:8080/JAXWSWeek03Axis/services/MessageWriterImpl?wsdl              bizim olusturdugumuz bu digerleri otomatik olusuyor. baska sýnnýf yazsak da olusuyor yani

//projeye sag týklandý -> new -> other -> web service -> ilgili service sýnýfý seçildi (messagewriterimpl) -> next->start server ->finish
//test service seçildi , client type : no client

//WEB-INF
//WEB-INF klasoru altinda lib klasorunde jar dosyalari yer alacaktir.
//WEB-INF klasoru altinda MessageWriterImplService klasoru yer alacaktir.
//WEB-INF klasoru altinda server-config.wsdd dosyasi olusacaktir.
//(wsdd – Web Service Deployment Descriptor)
//An Axis specific web service deployment configuration file.
//WEB-INF/web.xml dosyasi konfigurasyonu eklenecektir.