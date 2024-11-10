import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    // Construtor do banco
    public Banco() {
        contas = new ArrayList<>();
    }

    // Método para adicionar uma nova conta
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }

    // Método para buscar uma conta pelo número
    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    // Método para listar todas as contas
    public void listarContas() {
        for (ContaBancaria conta : contas) {
            conta.exibirInformacoes();
            System.out.println("---------------");
        }
    }
}
