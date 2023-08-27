package com.oliveiragabrielc.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String id) {
		super("Could not find user: " + id);
	}
}
