
package trng.soap.service.loan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.soap.service.loan package. 
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

    private final static QName _ProcessLoanRequest_QNAME = new QName("http://www.trng.org/LoanService/", "processLoanRequest");
    private final static QName _ProcessLoanResponse_QNAME = new QName("http://www.trng.org/LoanService/", "processLoanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.soap.service.loan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessLoanResponse }
     * 
     */
    public ProcessLoanResponse createProcessLoanResponse() {
        return new ProcessLoanResponse();
    }

    /**
     * Create an instance of {@link ProcessLoanRequest }
     * 
     */
    public ProcessLoanRequest createProcessLoanRequest() {
        return new ProcessLoanRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessLoanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.trng.org/LoanService/", name = "processLoanRequest")
    public JAXBElement<ProcessLoanRequest> createProcessLoanRequest(ProcessLoanRequest value) {
        return new JAXBElement<ProcessLoanRequest>(_ProcessLoanRequest_QNAME, ProcessLoanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessLoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.trng.org/LoanService/", name = "processLoanResponse")
    public JAXBElement<ProcessLoanResponse> createProcessLoanResponse(ProcessLoanResponse value) {
        return new JAXBElement<ProcessLoanResponse>(_ProcessLoanResponse_QNAME, ProcessLoanResponse.class, null, value);
    }

}
