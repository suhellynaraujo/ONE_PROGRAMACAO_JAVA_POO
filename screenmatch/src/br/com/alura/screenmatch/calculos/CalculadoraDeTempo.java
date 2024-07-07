package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme filmes){
//    this.tempoTotal += filmes.getDuracaoEmMinutos();
//    }
//    sobrecarga
//    public void inclui(Serie series){
//        this.tempoTotal += series.getDuracaoEmMinutos();
//    }

    //Desing das classes

    // Polimorfismo - pegar a classe mãe e passar como argumento para reaproveitar os tributos para usar em várias "formas" (subclasses)
    public void inclui(Titulo titulos){
        System.out.println("Adicionando duração em minutos de: " + titulos);
    this.tempoTotal += titulos.getDuracaoEmMinutos();
    }
}
