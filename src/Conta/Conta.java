package Conta;

public class Conta implements InterfaceConta {
    private String tipoConta;
    private String tipoCliente;
    private String dataAbertura;
    private double saldo;

    public Conta(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double calcularValorTarifaManutencao() {
        // Implemente a lógica de cálculo da tarifa de manutenção aqui
        return 0.0;
    }
}
