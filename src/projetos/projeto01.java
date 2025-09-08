package projetos;

import java.util.Scanner;

public class projeto01 {
    public static void main(String[] args) {
        int user = 0;
        String nome = "Sthefanie";
        String conta = "Corrente";
        float saldo = 2500F;

        System.out.println("Digite o número da sua conta: ");
        Scanner leitor = new Scanner(System.in);
        user = leitor.nextInt();


        if (user == 123) {
            System.out.println(" Nome: " + nome);
            System.out.println(" Tipo de conta: " + conta);
            System.out.println(" Saldo em conta: " + saldo);

            System.out.println("Escolha uma opção: ");
            System.out.println("1. Consultar seu saldo: ");
            System.out.println("2. Depositar: ");
            System.out.println("3. Transferir quantia: ");
            System.out.println("4. Para sair: ");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar? ");
                    double deposito = leitor.nextDouble();
                    saldo += deposito;
                    System.out.println("Seu novo saldo é de: " + saldo);
                    break;
                case 3:
                    System.out.println("Quanto deseja transferir? ");
                    double transferencia = leitor.nextDouble();
                    if (saldo >= transferencia){
                        double novoSaldo = saldo - transferencia;
                        System.out.println("Seu novo saldo é de: " + novoSaldo);
                    } else {
                        System.out.println("Saldo insuficiente para transferencia");
                    }
                    break;
                case 4:
                    System.out.println("Sessão encerrada.");
                    break;
            }
        }
    }
}
