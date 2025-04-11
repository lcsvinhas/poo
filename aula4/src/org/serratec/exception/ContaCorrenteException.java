package org.serratec.exception;

public class ContaCorrenteException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ContaCorrenteException(String message) {
        super(message);
    }
}
