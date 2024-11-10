public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String nomeCliente;

    // Construtor da conta bancária
    public ContaBancaria(int numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0; // Saldo inicial zero
    }

    // Método para obter o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.println("Saldo atual de R$" + saldo);
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: R$" + saldo);
    }
}
