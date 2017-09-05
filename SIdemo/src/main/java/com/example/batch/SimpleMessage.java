package com.example.batch;

public class SimpleMessage {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SimpleMessage [message=" + message + "]";
	}

}
