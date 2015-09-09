package com.diplab.device;

public class RunLIRC {

	public static void executeAC() {
		try {
			Runtime runtime = Runtime.getRuntime();
			Process process = runtime.exec(new String[] { "/usr/bin/irsend",
					"SEND_ONCE", "/home/pi/lircd.conf", "KEY_PLAY" });
			int exitValue = process.waitFor();
			System.out.println("exit value: " + exitValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		executeAC();
	}

}
