package com.diplab.webservice;

import javax.xml.ws.Endpoint;

import com.diplab.serviceImp.HelloService131Impl;


public class Escape {
	
	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9005/webservice/sayHello",
				new HelloService131Impl());
		
		System.out.println("Escape_131");

	}

}
