package Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        // lógica arbitrária para calcular a tarifa de manutenção da Conta Poupança
        return 0.2;
    }
}
