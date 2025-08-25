package poo;

import java.util.Random;

public class LutaAgregacao {

    private Lutador desafiado, desafiante; // a classe será usada como um atributo aqui
    private int rounds;
    private boolean lutaAprovada;

    public LutaAgregacao(Lutador desafiado, Lutador desafiante, int rounds, boolean lutaAprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.lutaAprovada = lutaAprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isLutaAprovada() {
        return lutaAprovada;
    }

    public void setLutaAprovada(boolean lutaAprovada) {
        this.lutaAprovada = lutaAprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {

        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.getNome().equals(l2.getNome())) {
            System.out.println("Luta marcada!");
            setLutaAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("Luta impossível de acontecer");
            setLutaAprovada(false);
        }

    }

    public void luta(){
        if (this.lutaAprovada) {
            this.desafiado.apresentacaoLutador();
            this.desafiante.apresentacaoLutador();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor) {
                case 0: // empate
                    System.out.println("Empatou!");
                    this.desafiado.resultado("D");
                    this.desafiante.resultado("D");
                    break;
                case 1: // desafiado vence
                    System.out.println("O vencedor é " + this.desafiado.getNome());
                    this.desafiado.resultado("W");
                    this.desafiante.resultado("L");
                    break;
                case 2: // desafiante vence
                    System.out.println("O vencedor é " + this.desafiante.getNome());
                    this.desafiado.resultado("L");
                    this.desafiante.resultado("W");
                    break;
            }

        }else{
            System.out.println("A luta não poderá acontecer");
        }


    }

}
