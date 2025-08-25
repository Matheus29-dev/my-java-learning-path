package poo;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double peso, altura;

    public Lutador(String nome, String nacionalidade, String categoria, int idade, int vitorias, int derrotas,
            int empates, double peso, double altura) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void categoria() {
        if (this.getPeso() <= 60) {
            setCategoria("Peso leve");
            System.out.println("Sua categoria é: " + getCategoria());

        } else if (this.getPeso() <= 80) {
            setCategoria("Peso médio");
            System.out.println("Sua categoria é: " + getCategoria());
        } else {
            setCategoria("Peso pesado");
            System.out.println("Sua categoria é: " + getCategoria());
        }
    }

    public void resultado(String a) {
        switch (a) {
            case "W":
                this.setVitorias(this.getVitorias() + 1);
                break;
            case "L":
                this.setDerrotas(this.getDerrotas() + 1);
                break;
            case "D":
                this.setEmpates(this.getEmpates() + 1);
                break;
            default:
                System.out.println("Insira apenas W para vitória, L para derrota e D para empate");
                break;
        }
    }

    public void apresentacaoLutador() {

        System.out.println("----------Lutador " + this.getNome() + " -----------");
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("--------------------------------------------------");

    }

}
