package poo;

public class Polimorfismo { //será feito pensando em uma peça de roupa

    private int tamanho;
    private String cor, estilo;
    private double preco;
    private boolean bonito;
    
    
    public Polimorfismo(int tamanho, String cor, String estilo, double preco, boolean bonito) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.estilo = estilo;
        this.preco = preco;
        this.bonito = bonito;
    }


    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getEstilo() {
        return estilo;
    }


    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public boolean isBonito() {
        return bonito;
    }


    public void setBonito(boolean bonito) {
        this.bonito = bonito;
    }

    public void verRoupa(){
        if (this.isBonito()) {
            System.out.println("A cor é "+ this.getCor());
        }
    }                    //esses dois métodos são exemplos de polimorfismo de sobrecarga, visto que eles
                        //têm o mesmo nome, mas o que os diferencia são seus parâmetros(o que há entre os seus parenteses)

    public void verRoupa(double precoMax){
        if (this.getPreco() < precoMax && precoMax<=50) {
            System.out.println("O preço é "+ this.getPreco());
        } else {
            System.out.println("A roupa é cara");
        }
    }

    public void testeOverride(){
        System.out.println("Override antigo"); //aqui testarei o polimorfismo de sobrescrita
    }

    

    




}
