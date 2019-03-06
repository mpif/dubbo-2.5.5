package com.alibaba.dubbo.common.serialize.support.kryo;

import java.io.Serializable;

public class RestRequest<T> implements Serializable {
	private static final long serialVersionUID = 1765349131408871741L;
	
	private T request;

	public RestRequest() {
	}
	
	public RestRequest(T request) {
		this.request = request;
	}

	public T getRequest() {
		return request;
	}

	public void setRequest(T request) {
		this.request = request;
	}
	
	
}
