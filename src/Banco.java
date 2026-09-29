import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {

        System.out.println("\n=== CONTAS DO BANCO " + nome + " ===");

        for (Conta conta : contas) {
            System.out.println(
                "Cliente: " + conta.getCliente().getNome()
                + " | Agência: " + conta.getAgencia()
                + " | Conta: " + conta.getNumero()
            );
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
}