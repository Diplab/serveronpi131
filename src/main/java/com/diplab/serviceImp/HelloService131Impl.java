package com.diplab.serviceImp;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.diplab.device.RpiCO2;
import com.diplab.device.RpiTrunLightController;
import com.diplab.device.RunLIRC;
import com.diplab.service.HelloService131;

@WebService(endpointInterface = "com.diplab.service.HelloService131")
public class HelloService131Impl implements HelloService131 {

	@Override
	public String sayHello(String name) {
		System.out.format("in sayHello: Receive %s ", name);
		return "JAVA-WS " + name;
	}

	public static void main(String[] args) {
		System.out.println("HI");
		Endpoint.publish("http://0.0.0.0:9005/webservice/sayHello",
				new HelloService131Impl());
	}

	@Override
	public double CO2ppm() {
		return RpiCO2.get();
	}

	@Override
	public void off() {
		RpiTrunLightController.off();
		return;

	}

	@Override
	public void on() {
		RpiTrunLightController.on();
		return;
	}

	@Override
	public void toggle() {
		RpiTrunLightController.toggle();
		return;
	}

	@Override
	public void executeAC() {
		RunLIRC.executeAC();
		return;

	}
}
