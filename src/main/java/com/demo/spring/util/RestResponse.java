package com.demo.spring.util;

public class RestResponse {

	private Integer reponseCode;
	private String message;
	
	public RestResponse(Integer responseCode) {
		this.reponseCode = responseCode;
	}
	
	
	
	public RestResponse(Integer reponseCode, String message) {
		this.reponseCode = reponseCode;
		this.message = message;
	}



	public void setResponseCode(Integer responseCode) {
		this.reponseCode = responseCode;
	}
	
	public Integer getResponseCode() {
		return this.reponseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
