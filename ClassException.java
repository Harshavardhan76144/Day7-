package com.vips.edu.emp;
public class ClassException extends Exception{
	private String excMsg = "";

	public ClassException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "City Exception :- "+excMsg;
	}
}
