package org.example;

public class BadRequestException extends RuntimeException {

	public BadRequestException() {
		super("Bad Request, you must input 3 length");
	}
}
