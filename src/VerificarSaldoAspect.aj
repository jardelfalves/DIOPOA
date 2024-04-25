public aspect VerificarSaldoAspect {
    before(): execution(* Conta.sacar(double)) {
        if (!verificarSaldo(thisJoinPoint.getThis(), thisJoinPoint.getArgs()[0])) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
    }

    private boolean verificarSaldo(Conta conta, double valor) {
        return conta.getSaldo() >= valor;
    }
}
