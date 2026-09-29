public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital DIO");

        Cliente cliente1 = new Cliente("Hubert");
        Cliente cliente2 = new Cliente("Maria");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        System.out.println("=== BANCO DIGITAL ===");

        contaCorrente.depositar(1000);

        contaCorrente.imprimirExtrato();

        contaCorrente.sacar(200);

        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(300, contaPoupanca);

        contaCorrente.imprimirExtrato();

        contaPoupanca.imprimirExtrato();

        banco.listarContas();
    }
}