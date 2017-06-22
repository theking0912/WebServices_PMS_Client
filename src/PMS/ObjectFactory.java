
package PMS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the PMS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStoredItemResponse_QNAME = new QName("http://service.pms.com/", "getStoredItemResponse");
    private final static QName _GetStoredItem_QNAME = new QName("http://service.pms.com/", "getStoredItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: PMS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStoredItemResponse }
     * 
     */
    public GetStoredItemResponse createGetStoredItemResponse() {
        return new GetStoredItemResponse();
    }

    /**
     * Create an instance of {@link GetStoredItem }
     * 
     */
    public GetStoredItem createGetStoredItem() {
        return new GetStoredItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoredItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pms.com/", name = "getStoredItemResponse")
    public JAXBElement<GetStoredItemResponse> createGetStoredItemResponse(GetStoredItemResponse value) {
        return new JAXBElement<GetStoredItemResponse>(_GetStoredItemResponse_QNAME, GetStoredItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoredItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pms.com/", name = "getStoredItem")
    public JAXBElement<GetStoredItem> createGetStoredItem(GetStoredItem value) {
        return new JAXBElement<GetStoredItem>(_GetStoredItem_QNAME, GetStoredItem.class, null, value);
    }

}
