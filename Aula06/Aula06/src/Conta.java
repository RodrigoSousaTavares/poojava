public class Conta {
    private double saldo;
    // <modificador> <tipo> <nome> (<tipo> nome)
    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Não pode depositar número negativo");
        } else{
            saldo = saldo + valor;
        }

    }
    // <modificador> <tipo> <nome>
    public double getSaldo() {
    return saldo;
    }
}
