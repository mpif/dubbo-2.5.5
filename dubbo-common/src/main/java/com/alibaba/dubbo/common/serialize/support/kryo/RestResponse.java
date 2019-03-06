package com.alibaba.dubbo.common.serialize.support.kryo;

import java.io.Serializable;


public class RestResponse<T> implements Serializable {
	private static final long serialVersionUID = 5058081480649030877L;

	private String status;

	private String message;
	
	private T result;

	public RestResponse() {
	}

	public RestResponse(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	
}
