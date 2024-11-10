import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        // Criando algumas contas
        ContaBancaria conta1 = new ContaBancaria(1, "João Silva");
        ContaBancaria conta2 = new ContaBancaria(2, "Maria Souza");

        // Adicionando contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Menu de operações
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Listar Contas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número da Conta: ");
                    int numeroContaDep = scanner.nextInt();
                    ContaBancaria contaDep = banco.buscarConta(numeroContaDep);
                    if (contaDep != null) {
                        System.out.print("Valor para depositar: ");
                        double valorDep = scanner.nextDouble();
                        contaDep.depositar(valorDep);
                    }
                    break;
                case 2:
                    System.out.print("Número da Conta: ");
                    int numeroContaSaq = scanner.nextInt();
                    ContaBancaria contaSaq = banco.buscarConta(numeroContaSaq);
                    if (contaSaq != null) {
                        System.out.print("Valor para sacar: ");
                        double valorSaq = scanner.nextDouble();
                        contaSaq.sacar(valorSaq);
                    }
                    break;
                case 3:
                    System.out.print("Número da Conta: ");
                    int numeroContaSaldo = scanner.nextInt();
                    ContaBancaria contaSaldo = banco.buscarConta(numeroContaSaldo);
                    if (contaSaldo != null) {
                        contaSaldo.exibirSaldo();
                    }
                    break;
                case 4:
                    banco.listarContas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
