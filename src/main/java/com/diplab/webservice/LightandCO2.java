package com.diplab.webservice;

import javax.xml.ws.Endpoint;

import com.diplab.serviceImp.CO2Service131Impl;
import com.diplab.serviceImp.LightService131Impl;


public class LightandCO2 {
	
	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9004/webservice/sayCO2",
				new CO2Service131Impl());
		
		System.out.println("CO2_131");

		Endpoint.create(new LightService131Impl()).publish(
				"http://0.0.0.0:9006/webservice/sayLight");
		
		System.out.println("Light_131");
	}

}
