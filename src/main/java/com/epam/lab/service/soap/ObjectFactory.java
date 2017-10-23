
package com.epam.lab.service.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab.service.soap package. 
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

    private final static QName _MinusResponse_QNAME = new QName("http://soap.service.lab.epam.com/", "minusResponse");
    private final static QName _MultipleResponse_QNAME = new QName("http://soap.service.lab.epam.com/", "multipleResponse");
    private final static QName _Multiple_QNAME = new QName("http://soap.service.lab.epam.com/", "multiple");
    private final static QName _PlusResponse_QNAME = new QName("http://soap.service.lab.epam.com/", "plusResponse");
    private final static QName _Plus_QNAME = new QName("http://soap.service.lab.epam.com/", "plus");
    private final static QName _Percent_QNAME = new QName("http://soap.service.lab.epam.com/", "percent");
    private final static QName _DivisionResponse_QNAME = new QName("http://soap.service.lab.epam.com/", "divisionResponse");
    private final static QName _Division_QNAME = new QName("http://soap.service.lab.epam.com/", "division");
    private final static QName _Minus_QNAME = new QName("http://soap.service.lab.epam.com/", "minus");
    private final static QName _PercentResponse_QNAME = new QName("http://soap.service.lab.epam.com/", "percentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab.service.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link Minus }
     * 
     */
    public Minus createMinus() {
        return new Minus();
    }

    /**
     * Create an instance of {@link PercentResponse }
     * 
     */
    public PercentResponse createPercentResponse() {
        return new PercentResponse();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Multiple }
     * 
     */
    public Multiple createMultiple() {
        return new Multiple();
    }

    /**
     * Create an instance of {@link PlusResponse }
     * 
     */
    public PlusResponse createPlusResponse() {
        return new PlusResponse();
    }

    /**
     * Create an instance of {@link MinusResponse }
     * 
     */
    public MinusResponse createMinusResponse() {
        return new MinusResponse();
    }

    /**
     * Create an instance of {@link MultipleResponse }
     * 
     */
    public MultipleResponse createMultipleResponse() {
        return new MultipleResponse();
    }

    /**
     * Create an instance of {@link Percent }
     * 
     */
    public Percent createPercent() {
        return new Percent();
    }

    /**
     * Create an instance of {@link Plus }
     * 
     */
    public Plus createPlus() {
        return new Plus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "minusResponse")
    public JAXBElement<MinusResponse> createMinusResponse(MinusResponse value) {
        return new JAXBElement<MinusResponse>(_MinusResponse_QNAME, MinusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "multipleResponse")
    public JAXBElement<MultipleResponse> createMultipleResponse(MultipleResponse value) {
        return new JAXBElement<MultipleResponse>(_MultipleResponse_QNAME, MultipleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "multiple")
    public JAXBElement<Multiple> createMultiple(Multiple value) {
        return new JAXBElement<Multiple>(_Multiple_QNAME, Multiple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "plusResponse")
    public JAXBElement<PlusResponse> createPlusResponse(PlusResponse value) {
        return new JAXBElement<PlusResponse>(_PlusResponse_QNAME, PlusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Plus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "plus")
    public JAXBElement<Plus> createPlus(Plus value) {
        return new JAXBElement<Plus>(_Plus_QNAME, Plus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Percent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "percent")
    public JAXBElement<Percent> createPercent(Percent value) {
        return new JAXBElement<Percent>(_Percent_QNAME, Percent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Minus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "minus")
    public JAXBElement<Minus> createMinus(Minus value) {
        return new JAXBElement<Minus>(_Minus_QNAME, Minus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PercentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.lab.epam.com/", name = "percentResponse")
    public JAXBElement<PercentResponse> createPercentResponse(PercentResponse value) {
        return new JAXBElement<PercentResponse>(_PercentResponse_QNAME, PercentResponse.class, null, value);
    }

}
