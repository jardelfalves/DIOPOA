import Conta.Conta;
import Conta.ContaInvestimento;
import Conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Conta contaCorrente = new ContaInvestimento("Investimento", "Normal", "hoje", 0);
        contaCorrente.depositar(1000);
        contaCorrente.sacar(500); // Deve ser bem-sucedido

        Conta contaSalario = new ContaPoupanca("Poupança", "Normal", "hoje", 0);
        contaSalario.depositar(1000);
        contaSalario.sacar(1500); // Deve gerar mensagem de saldo insuficiente
    }
}
