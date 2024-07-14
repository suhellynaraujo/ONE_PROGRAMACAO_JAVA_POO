package br.com.alura.screenmatch.excecoes;

public class ErroDeConversaoAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoAnoException(String mensagem) {
        this.mensagem = mensagem;

    }

    public String getMensagem() {
        return this.mensagem;
    }
}
