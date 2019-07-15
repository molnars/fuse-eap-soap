/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package soap.mw1.tedata;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.Addressing;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

import custom_types.wservices.QuotaReturn;
import custom_types.wservices.QuotaType;

/**
 * @author rsearls@redhat.com
 */

@WebService(
			portName = "MiddlewareServices",
			serviceName  = "MiddlewareServices",
			wsdlLocation = "WEB-INF/wsdl/ws.wsdl",
			targetNamespace = "tedata.mw1.soap",
			endpointInterface = "soap.mw1.tedata.MiddlewareServices")
//@Addressing(enabled = true, required = true)
public class MiddlewareServicesImp implements MiddlewareServices {
	@Resource(name = "java:jboss/camel/context/spring-context")
	private CamelContext camelContext;
	
	@Override
	public QuotaReturn getUserQuota(String key, String userName) {
		// TODO Auto-generated method stub
		custom_types.wservices.ObjectFactory of = new custom_types.wservices.ObjectFactory();
		QuotaReturn qr = of.createQuotaReturn();
		// setQuota(JAXBElement<QuotaType> value)
		QuotaType qt = of.createQuotaType();
		qt.setBasicQuota(of.createQuotaTypeBasicQuota(new Double(10)));
		qt.setConsumedTopupQuota(of.createQuotaTypeConsumedTopupQuota(new Double(5)));
		qt.setEndDate(of.createQuotaTypeEndDate("1/8/2019"));
		qt.setRemainingTopupQuota(of.createQuotaTypeRemainingTopupQuota(new Double(7)));
		//qt.setService(of.createQuotaTypeService("local calls"));
		qt.setStartDate(of.createQuotaTypeStartDate("1/1/2019"));
		qt.setTotalAllowedQuota(of.createQuotaTypeTotalAllowedQuota(new Double(30)));
		qt.setTotalConsumedQuota(of.createQuotaTypeTotalConsumedQuota(new Double(12)));
		qt.setTotalTopupQuota(of.createQuotaTypeTotalTopupQuota(new Double(5)));
		
		ProducerTemplate producer = camelContext.createProducerTemplate();
		
		String result = producer.requestBodyAndHeader("direct:start", userName, "userName", userName, String.class);
		
        //String result = producer.requestBody("direct:start", userName, String.class);
        qt.setService(of.createQuotaTypeService(result));
        
		qr.setQuota(of.createQuotaType(qt));
		qr.setSuccess(of.createBasicReturnSuccess(true));
		
		
		
		
		return qr;
	}
}
