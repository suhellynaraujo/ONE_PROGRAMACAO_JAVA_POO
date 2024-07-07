package br.com.alura.screenmatch.modelos;

//todo filme é um título
public class Filme extends Titulo {

    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
