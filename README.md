# TSN_JAVA_SOAP
Пример использования клиент-серверной технологии SOAP на Java


http://localhost:8194/mysoap/test?wsdl
```
This XML file does not appear to have any style information associated with it. The document tree is shown below.
<wsdl:definitions xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="http://soap.java.tsn/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:ns1="http://schemas.xmlsoap.org/soap/http" name="CommunicationWithClientService" targetNamespace="http://soap.java.tsn/">
<wsdl:types>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:tns="http://soap.java.tsn/" elementFormDefault="unqualified" targetNamespace="http://soap.java.tsn/" version="1.0">
<xs:element name="quadraticEquation" type="tns:quadraticEquation"/>
<xs:element name="quadraticEquationResponse" type="tns:quadraticEquationResponse"/>
<xs:complexType name="quadraticEquation">
<xs:sequence>
<xs:element name="arg0" type="xs:double"/>
<xs:element name="arg1" type="xs:double"/>
<xs:element name="arg2" type="xs:double"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="quadraticEquationResponse">
<xs:sequence>
<xs:element minOccurs="0" name="return" type="tns:answerQE"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="answerQE">
<xs:sequence>
<xs:element name="x1" type="xs:double"/>
<xs:element name="x2" type="xs:double"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</wsdl:types>
<wsdl:message name="quadraticEquationResponse">
<wsdl:part element="tns:quadraticEquationResponse" name="parameters"> </wsdl:part>
</wsdl:message>
<wsdl:message name="quadraticEquation">
<wsdl:part element="tns:quadraticEquation" name="parameters"> </wsdl:part>
</wsdl:message>
<wsdl:portType name="ICommunicationWithClient">
<wsdl:operation name="quadraticEquation">
<wsdl:input message="tns:quadraticEquation" name="quadraticEquation"> </wsdl:input>
<wsdl:output message="tns:quadraticEquationResponse" name="quadraticEquationResponse"> </wsdl:output>
</wsdl:operation>
</wsdl:portType>
<wsdl:binding name="CommunicationWithClientServiceSoapBinding" type="tns:ICommunicationWithClient">
<soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="quadraticEquation">
<soap:operation soapAction="" style="document"/>
<wsdl:input name="quadraticEquation">
<soap:body use="literal"/>
</wsdl:input>
<wsdl:output name="quadraticEquationResponse">
<soap:body use="literal"/>
</wsdl:output>
</wsdl:operation>
</wsdl:binding>
<wsdl:service name="CommunicationWithClientService">
<wsdl:port binding="tns:CommunicationWithClientServiceSoapBinding" name="CommunicationWithClientPort">
<soap:address location="http://localhost:8194/mysoap/test"/>
</wsdl:port>
</wsdl:service>
</wsdl:definitions>
```

[Почитать по теме](https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-endpoint-example)

[Почитать по теме](http://javastudy.ru/web-services/soap-java-hello-world-example)

