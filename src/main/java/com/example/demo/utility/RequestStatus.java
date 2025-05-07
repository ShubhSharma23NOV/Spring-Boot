package com.example.demo.utility;

public class RequestStatus {
	private String errorMessage;
	private int errorCode;
	
	public RequestStatus(String errorStatus, int errorCode) {
		super();
		this.errorMessage = errorStatus;
		this.errorCode = errorCode;
	}
	
	@Override
	public String toString() {
		return "RequestStatus [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}
	public String getErrorStatus() {
		return errorMessage;
	}
	public void setErrorStatus(String errorStatus) {
		this.errorMessage = errorStatus;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
