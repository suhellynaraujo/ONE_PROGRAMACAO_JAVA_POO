import java.util.Locale;
import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        String nomeCliente = "Carla";
        String tipoConta = "Conta Corrente";
        double saldoInicial = 2500.00 ;

        System.out.println("*******************************************");
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        //String saldoAtualFormatado = String.format("%.2f", saldoInicial);
        System.out.println("Saldo Inicial: " + String.format("%.2f", saldoInicial));
        System.out.println("\n*******************************************");

        int opcao = 0;
        double saldoAtualizado = saldoInicial;

        while (opcao != 4) {
            // menu
            System.out.println("\nOperações");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada:");
            opcao = scann.nextInt();

            if (opcao == 1) {
                // Consultar saldo
                System.out.println("Saldo atual: " + String.format("%.2f", saldoInicial));
            } else if (opcao == 2) {
                // Receber valor
                System.out.println("Informe o valor a receber: ");
                double valorRecebido = scann.nextDouble();
                saldoAtualizado += valorRecebido; // Adiciona o valor recebido ao saldo atual
                //String saldoRecebidoFormatado = String.format("%.2f", saldoAtualizado);
                System.out.println("Saldo atualizado R$ " +String.format("%.2f", saldoAtualizado));
            } else if (opcao == 3) {
                // Transferir valor
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferido = scann.nextDouble();
                if (valorTransferido > saldoAtualizado) {
                    System.out.println("Não há saldo disponível para fazer essa transferência!");
                    System.out.println("Seu saldo é de: R$" + String.format("%.2f", saldoAtualizado));
                } else {
                    saldoAtualizado -= valorTransferido; // Subtrai o valor transferido do saldo atual
                   // String saldoTransferidoFormatado = String.format("%.2f", saldoAtualizado);
                    System.out.println("Saldo atualizado R$ " + String.format("%.2f", saldoAtualizado));
                }
            } else if (opcao == 4) {
                System.out.println("Até mais!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
