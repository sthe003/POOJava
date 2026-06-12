package br.com.estruturaDeControle.validador;

public class SenhaInvalidaException extends RuntimeException {

  public SenhaInvalidaException(String message) {
    super(message);
  }
}
