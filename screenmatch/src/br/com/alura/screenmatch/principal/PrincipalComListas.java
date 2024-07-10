package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(3);
        var maisUmFilme =  new Filme("DogVille",2003);
        maisUmFilme.avalia(10);
        Serie lost = new Serie("Lost", 200);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(lost);
        // para cada titulo(item) da minha lista  itere ...
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme){
                // cast de da classe Filme
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Jacque");
        buscaPorArtista.add("Paulo");
        System.out.println(buscaPorArtista);

        // ordenar por ordem alfabetica
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        // comparador
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
    }
}
