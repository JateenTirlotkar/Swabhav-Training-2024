package Proxy.test;

import Proxy.model.IInternet;
import Proxy.model.ProxyInternet;

public class InternetTest {
	public static void main(String[] args) {
		IInternet internet = new ProxyInternet();
		internet.connectTo("google.com");
		internet.connectTo("bbc.com");
	}

}
