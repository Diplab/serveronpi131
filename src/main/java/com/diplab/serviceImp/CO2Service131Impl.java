package com.diplab.serviceImp;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.diplab.device.RpiCO2;
import com.diplab.service.CO2Service131;

@WebService(endpointInterface = "com.diplab.service.CO2Service131")
public class CO2Service131Impl implements CO2Service131 {

	@Override
	public String sayHello(String name) {
		System.out.format("in sayHello: Receive %s ", name);
		return "JAVA-WS " + name;
	}

	public static void main(String[] args) {
		System.out.println("CO2");
		Endpoint.publish("http://0.0.0.0:9004/webservice/sayCO2",
				new CO2Service131Impl());
	}

	@Override
	public double CO2ppm() {
		return RpiCO2.get();
	}


}
