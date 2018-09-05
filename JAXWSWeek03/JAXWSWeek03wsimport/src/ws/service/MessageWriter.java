
package ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MessageWriter", targetNamespace = "http://service.ws/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MessageWriter {


    /**
     * 
     * @param surname
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.ws/MessageWriter/getWelcomeMessageRequest", output = "http://service.ws/MessageWriter/getWelcomeMessageResponse")
    public String getWelcomeMessage(
        @WebParam(name = "name", partName = "name")
        String name,
        @WebParam(name = "surname", partName = "surname")
        String surname);

}