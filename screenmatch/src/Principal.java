public class Principal {
    public static void main(String[] args) {
        // novo objeto do tipo filme
        //tipo referencia
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento =1970;
        meuFilme.duracaoEmMinutos = 188;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
       // meuFilme.somaAvaliacoes = 10;
       // meuFilme.totalDeAvaliacao = 1;
       // System.out.println(meuFilme.pegaMedia());
    }
}
