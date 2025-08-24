package poo;

public class Banco {

    public int numConta;
    private String dono;
    protected String tipo;
    private double saldo;
    private boolean status;

    public Banco(String dono, int numConta, double saldo, boolean status, String tipo) {
        this.dono = dono;
        this.numConta = numConta;
        this.saldo = saldo;
        this.status = status;
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    

    void metodoAbrirConta() {
        System.out.println("------------------------");
        System.out.println("Seu número da conta é " + getNumConta());
        System.out.println("Seu tipo de conta é " + getTipo());
        System.out.println("O nome do titular da conta é " + getDono());
        System.out.println("Seu saldo da conta é " + getSaldo());
        System.out.println("Sua conta está ativa? " + isStatus());
        System.out.println("------------------------");

    }

    void metodoDepositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.println("Seu saldo agora é: " + getSaldo());
        } else {
            System.out.println("Transferêcia indisponível");
        }
    }

    void metodoSacar(double valor) {
        if (valor>0 && saldo > valor) {
            saldo -= valor;
            System.out.println("Você sacou " + valor + " reais. Seu saldo agora é: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void metodoPagamentoMensal() {
        if (saldo > 12) {
            saldo -= 12;
            System.out.println("Você pagou sua mensalidade de 12 reais. Seu saldo agora é: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void metodoEncerrarConta(){
        if (getSaldo()<0) {
            System.out.println("Você não pode fechar a sua conta com saldo negativo");
        }else{
            System.out.println("Conta será encerrada, mas antes saque: "+getSaldo());
        }
    }

}
