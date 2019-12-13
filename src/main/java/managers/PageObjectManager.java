package managers;

import java.io.IOException;

import requests.PunkApiRequestClient;

public class PageObjectManager {
	
	private static PunkApiRequestClient punkApi;
	
	private static PunkApiRequestClient getPunkApi() throws IOException {
		if(punkApi == null) {
			punkApi = new PunkApiRequestClient();
		}
		return punkApi;
	}
	
	public static Object getPageObject(String classname) throws IOException {
		
		if(classname.contains("punkApi")) {
			return getPunkApi();
		}
		return punkApi;
	}

}
