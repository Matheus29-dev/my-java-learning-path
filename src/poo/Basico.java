package poo;

public class Basico { // meu exemplo vai ser uma TV

    int polegadas, ano;
    String cor, marca;
    boolean ligada;

    public Basico(int polegadas, int ano, String cor, String marca) {
        this.polegadas = polegadas;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.ligada = false; // TV inicia desligada
    }

    void metodoStatusTv() {
        System.out.println("A tv tem " + this.polegadas + " polegadas");
        System.out.println("Ela é do ano de " + this.ano);
        System.out.println("A cor dela é " + this.cor);
        System.out.println("A marca dela é " + this.marca);
        if (ligada ==true) {
            System.out.println("A tv está ligada");

        } else {
            System.out.println("A TV está desligada");
        }

    }

    boolean metodoLigar() {
        if (ligada ==false) {
            System.out.println("A tv será ligada");
        }
        return ligada = true;

    }

}
