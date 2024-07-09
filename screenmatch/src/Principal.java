import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // novo objeto do tipo filme
        //tipo referencia
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(188);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
       // meuFilme.somaAvaliacoes = 10;
       // meuFilme.totalDeAvaliacao = 1;
       // System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 200);
        //lost.setNome("Lost");
        //lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutoPorEpsodio(50);
        System.out.println("Duração par amaratonar a série: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodios = new Episodio();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);

        //Filme maisUmFilme =  new Filme();
        //inferencia do tipo Filme
        var maisUmFilme =  new Filme("DogVille",2003);
        maisUmFilme.setDuracaoEmMinutos(200);
        //maisUmFilme.setNome("DogVille");
        //maisUmFilme.setAnoLancamento(2003);
        maisUmFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(maisUmFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }

}
