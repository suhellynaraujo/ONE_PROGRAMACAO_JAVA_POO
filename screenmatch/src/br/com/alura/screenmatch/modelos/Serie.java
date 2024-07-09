package br.com.alura.screenmatch.modelos;
//toda série é um titulo
public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutoPorEpsodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutoPorEpsodio() {
        return minutoPorEpsodio;
    }

    public void setMinutoPorEpsodio(int minutoPorEpsodio) {
        this.minutoPorEpsodio = minutoPorEpsodio;
    }
 // subrescrita de método - herda da superclasse , podendo ou não alterar o método
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutoPorEpsodio;
    }

    // superclasse (classe mãe) - generalização
    // subclasse (classes filhas) - especialização
    // Atributos (campos)
    // Metodos (fuções)
}
