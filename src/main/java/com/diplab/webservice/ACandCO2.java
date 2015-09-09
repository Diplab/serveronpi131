package com.diplab.webservice;

import javax.xml.ws.Endpoint;

import com.diplab.serviceImp.ACService131Impl;
import com.diplab.serviceImp.CO2Service131Impl;


public class ACandCO2 {
	
	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9004/webservice/sayCO2",
				new CO2Service131Impl());
		System.out.println("CO2_131");

		Endpoint.create(new ACService131Impl()).publish(
				"http://0.0.0.0:9003/webservice/sayAC");
		System.out.println("AC_131");
	}

}
