public class Filme {
    //abstração
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }
    
    void exibeFichaTecnica(){
        //acessar o atributo
        // instaciar objeto
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacao;
    }

}
