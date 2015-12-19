package com.rthinking.convert.edifact;

/**
 * Created by serayuzgur on 18/12/15.
 */
public class InvalidDocumentType extends Exception {
	public InvalidDocumentType() {
	}

	public InvalidDocumentType(String message) {
		super(message);
	}

	public InvalidDocumentType(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidDocumentType(Throwable cause) {
		super(cause);
	}

	public InvalidDocumentType(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
