package io.brahman.store.exception;

public class NoRecipientsException extends RuntimeException {

	public NoRecipientsException() {
		super("No recipient");
	}

}
