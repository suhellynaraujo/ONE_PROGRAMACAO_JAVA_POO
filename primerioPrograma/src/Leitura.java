import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        //leitura da entrada de dados digitado pelo usuario
        String filme = leitura.nextLine();
        System.out.println(filme);
    }
}
