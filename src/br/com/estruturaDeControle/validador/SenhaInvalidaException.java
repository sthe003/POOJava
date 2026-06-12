package br.com.estruturaDeControle.validador;

public class SenhaInvalidaException extends RuntimeException {
  private String mensagem;

  public SenhaInvalidaException(String message) {
    super(message);
  }

  @Override
  public String getMessage(){return this.mensagem;}
}
