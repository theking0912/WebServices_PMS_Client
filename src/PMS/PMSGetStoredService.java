
package PMS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PMSGetStoredService", targetNamespace = "http://service.pms.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PMSGetStoredService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStoredItem", targetNamespace = "http://service.pms.com/", className = "PMS.GetStoredItem")
    @ResponseWrapper(localName = "getStoredItemResponse", targetNamespace = "http://service.pms.com/", className = "PMS.GetStoredItemResponse")
    @Action(input = "http://service.pms.com/PMSGetStoredService/getStoredItemRequest", output = "http://service.pms.com/PMSGetStoredService/getStoredItemResponse")
    public String getStoredItem(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}