public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2024){
            System.out.println("Lançamento que os clientes estão curtindo:");
        }else {
            System.out.println("Filme retrô que vale apena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado!");
        }else {
            System.out.println("Deve pagar a locação!");
        }


    }
}
