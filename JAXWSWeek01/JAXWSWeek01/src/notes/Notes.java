package notes;

public class Notes {

}

// Java dunyasinda web service leri 2 ye ayirdik.

// JAX-RS
// JAX-WS( Java Api for xml web services) , Big WebSevice
// JAX-WS , JAX-RS kadar populer degil.

// Web Service'ler farkli uygulamalarin birlikte calismalarina firsat saglar.
// farkli uygulama, farkli framework , programlama dili vs fark etmez!
// web service ile bu farkli sistemler birbiriyle konusabilirler.

// JAX-WS , XML mesaj formatini ve SOAP standardini kullanir.
// SOAP -> Simple Object Access Protocol anlamina gelmektedir.

// Big web services use XML messages that follow the Simple Object Access Protocol (SOAP) 
// standard, an XML language defining a message architecture and message formats.


// server-client , sistemler arasinda ayni dile gerek yok. XML ile ortak bir dil elde edilmis olur.

// JAX-WS , Java EE bir bolumu. yeni ismiyle Jakarta EE
// https://jcp.org/en/jsr/detail?id=224

// JAX-WS implemantationlari;

// metro project // glasfish (https://javaee.github.io/metro/) reference implemantation
// apache axis 2
// apache cxf // http://cxf.apache.org/
// oracle weblogic
// jbossws ,

// --------
//
// ### SOAP -> simple object access protocol
// platform ve programlama dili bagimsiz.

// SOAP mesajlari complex bir yapiya sahiptir. JAX-WS bu complex yapiyi developerdan saklar.
// https://www.w3.org/TR/soap12/

// SOAP messages are complex, the JAX-WS API hides this complexity  from the application developer.

// boylelikle SOAP mesajlarinin parse/generate islemiyle ugrasmayiz.

// ### WSDL (Web Service Description Language)
// XMl tabanli bir dokuman.
// icerisinde web service dair bilgiler yer almakta.
// WSDL dokumani otomatik olarka olusturabiliriz. 
// herhangi bir wsdl dokumaninini kullanarak java kodlarini otomatik olarak olusturabiliriz.

// WSDL yardimiyla bir web service nasil erisebiliriz , hangi metotlar var , hangi parameterleri aliyor vs bilgilerine ulasabiliriz.


// WSDL can be used to describe the details of the contract, 
// which may include messages, operations, bindings, and the location of the web service.
// https://docs.oracle.com/javaee/7/tutorial/webservices-intro002.htm 


//     WSDL ELEMENTS           ////
/// <definitions>
//  WSDL in root elemanidir.
// targetNameSpace ve name gibi attributeler var.

//A WSDL document has a root wsdl:definitions element. 
// A wsdl:definitions element and its associated targetNamespace attribute is mapped to a Java package.

// <types>
//<types> element’i Web Service’te kullanilan data tiplerini belirtmek icin kullanilmaktadir.
// web servicete kullanilan parametreler burada yer alir.
// String , Integer gibi typelar icin bostur. Complex typelar icn bir tanim yer alir.
// https://docs.oracle.com/javaee/7/tutorial/jaxws002.htm#BNAZC

// <message>
// Web Service tanimli olan metotlar burada yer alir.
// metotlarin aldigi parametreler , donus parametresi vs bilgisini gorebiliriz.
	//<message name="getWelcomeMessage">
	//<part name="userName" type="xsd:string"/>
	//<part name="userSurname" type="xsd:string"/>
	//</message>
	//<message name="getWelcomeMessageResponse">
	//<part name="return" type="xsd:string"/>
	//</message>

// <portType>
// icerisinde input ve output taglari yer alir.
// message attribute'u ilgili message tagiyla eslesir.
// SEI (service endpint interface tanimi yer alir)

// A WSDL port type is a named set of abstract operation definitions.

	//<portType name="HelloMyService">
	//<operation name="getWelcomeMessage" parameterOrder="userName userSurname">
		//<input wsam:Action="http://service.ws.week01/HelloMyService/getWelcomeMessageRequest" message="tns:getWelcomeMessage"/>
		//<output wsam:Action="http://service.ws.week01/HelloMyService/getWelcomeMessageResponse" message="tns:getWelcomeMessageResponse"/>
	//</operation>
	//</portType>

// name="HelloMyService" , tanimli SEI (Service EndPoint Interface)

// A Java interface mapped from a wsdl:portType is called a Service Endpoint Interface  or SEI for short.
// Each wsdl:operation in a wsdl:portType is mapped to a Java method in the corresponding Java service endpoint interface.

// <binding>
// soap:binding tagi yer alir.
// Web Service style bilgisi ; RPC , Document
// literal ya da encoding olabilir.
// https://stackoverflow.com/questions/9062475/what-is-the-difference-between-document-style-and-rpc-style-communication


// <service>
// soap:address tagi yer almaktadir.
// hangi link , hangi port uzerinde service calisiyor anlayabiliriz.

//<service name="HelloMyServiceImplService">
//<port name="HelloMyServiceImplPort" binding="tns:HelloMyServiceImplPortBinding">
//<soap:address location="http://localhost:8888/week01/hello.service"/>
//</port>
//</service>