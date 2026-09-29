public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }

        this.saldo -= valor;
        contaDestino.saldo += valor;

        System.out.println("Transferência realizada com sucesso.");
    }

    protected void imprimirInformacoesComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    public abstract void imprimirExtrato();

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}