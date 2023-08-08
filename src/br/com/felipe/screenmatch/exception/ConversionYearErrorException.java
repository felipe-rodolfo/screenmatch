package br.com.felipe.screenmatch.exception;

public class ConversionYearErrorException extends RuntimeException {
    private String message;

    public ConversionYearErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
