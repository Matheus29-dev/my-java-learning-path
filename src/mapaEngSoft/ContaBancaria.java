package mapaEngSoft;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void verSaldo() {
        System.out.println("Seu saldo é: " + getSaldo());

    }

    public void depositar(double valor) {
        if (valor >= 0) {
            setSaldo(this.saldo + valor);
            System.out.println("Seu saldo agora é: " + getSaldo());
        } else {
            System.out.println("Transferêcia indisponível.");
        }
    }

    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(this.saldo - valor);
            System.out.println("Seu saldo agora é: " + getSaldo());
        } else {
            System.out.println("Impossível realizar a operação.");
        }
    }

    public static void main(String[] args) {

        ContaBancaria objTeste = new ContaBancaria("Matheus", 123, 250.70);

        objTeste.verSaldo();
        objTeste.depositar(40);
        objTeste.sacar(500);

    }

}
