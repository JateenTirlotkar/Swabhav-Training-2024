package Proxy.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet{
	private final IInternet internet = new RealInternet();
	private static final List<String> bannedSites;
	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("lion.com");
		bannedSites.add("bbc.com");
	}
	

	@Override
	public void connectTo(String host) {
		if(bannedSites.contains(host)) {
			System.out.println("Access Denied");
			return;
		}
		internet.connectTo(host);
			
		// TODO Auto-generated method stub
		
	}

}
