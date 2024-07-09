package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(3);
        var maisUmFilme =  new Filme("DogVille",2003);
        maisUmFilme.avalia(10);
        Serie lost = new Serie("Lost", 200);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(lost);
        // para cada titulo(item) da minha lista  itere ...
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            // cast de da classe Filme
            if (item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}
