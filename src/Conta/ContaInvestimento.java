package Conta;

public class ContaInvestimento extends Conta {
    public ContaInvestimento(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    @Override
    public double calcularValorTarifaManutencao() {
        // lógica arbitrária para calcular a tarifa de manutenção da Conta Poupança
        return 1.0;
    }
}
