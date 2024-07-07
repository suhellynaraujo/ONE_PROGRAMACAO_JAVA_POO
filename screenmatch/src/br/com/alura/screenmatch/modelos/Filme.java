package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

//todo filme é um título
//podemos extender(herdar) somente de 1 classe, nesse caso as demais podem ser como interfaces, para isso usamos o implements

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
