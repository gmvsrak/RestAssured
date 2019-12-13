package requests;

import java.io.IOException;

import utils.Functions;

public class PunkApiRequestClient {
	
	private String punkApiBaseUrl = null;
	private String punkApiResource = null;
	
	public PunkApiRequestClient() throws IOException{
		setPunkApiBaseUrl(Functions.getInstance().loadConfigFile("PunkApiConfig").getProperty("PunkApiBaseUrl"));
		setPunkApiResource(Functions.getInstance().loadConfigFile("PunkApiConfig").getProperty("getBeers"));
	}

	public String getPunkApiBaseUrl() {
		return punkApiBaseUrl;
	}

	public void setPunkApiBaseUrl(String punkApiBaseUrl) {
		this.punkApiBaseUrl = punkApiBaseUrl;
	}

	public String getPunkApiResource() {
		return punkApiResource;
	}

	public void setPunkApiResource(String punkApiResource) {
		this.punkApiResource = punkApiResource;
	}
	
	
	

}
