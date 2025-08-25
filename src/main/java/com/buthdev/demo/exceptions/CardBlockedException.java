package com.buthdev.demo.exceptions;

public class CardBlockedException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CardBlockedException(final String message) {
        super(message);
    }
}