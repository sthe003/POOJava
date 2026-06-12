package br.com.estruturaDeControle.consultandoGithub;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String message) {
        super(message);
    }
}
