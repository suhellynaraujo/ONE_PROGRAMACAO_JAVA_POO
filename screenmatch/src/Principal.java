public class Principal {
    public static void main(String[] args) {
        // novo objeto do tipo filme
        //tipo referencia
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento =1970;
        meuFilme.duracaoEmMinutos = 188;

        //acessar o atributo
        // instaciar objeto
        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoLancamento);


    }
}
