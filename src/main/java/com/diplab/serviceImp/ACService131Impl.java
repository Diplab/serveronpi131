package com.diplab.serviceImp;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.diplab.device.RunLIRC;
import com.diplab.service.ACService131;

@WebService(endpointInterface = "com.diplab.service.ACService131")
public class ACService131Impl implements ACService131 {

	@Override
	public String sayHello(String name) {
		System.out.format("in sayHello: Receive %s ", name);
		return "JAVA-WS " + name;
	}

	public static void main(String[] args) {
		System.out.println("AC");
		Endpoint.publish("http://0.0.0.0:9003/webservice/sayAC",
				new ACService131Impl());
	}

	@Override
	public void executeAC() {
		RunLIRC.executeAC();
		return;

	}

}
