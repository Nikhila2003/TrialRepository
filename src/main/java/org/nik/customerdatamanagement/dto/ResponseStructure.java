package org.nik.customerdatamanagement.dto;

import java.time.LocalDateTime;


public class ResponseStructure<T> {
	
	private Integer statusCode;
	
	private T data;
	
	private String message;
	
	private LocalDateTime timestamp;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ResponseStructure [statusCode=" + statusCode + ", data=" + data + ", message=" + message
				+ ", timestamp=" + timestamp + "]";
	}
	
}
