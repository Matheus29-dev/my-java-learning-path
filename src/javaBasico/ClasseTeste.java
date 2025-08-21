package javaBasico;

public class ClasseTeste {
    String carroNome;
    int ano;

    private String curso; // teste em variável em private para uso em encapsulamento get e set

    public ClasseTeste(String carroNome, int ano) { // testando CONSTRUTORES
        this.carroNome = carroNome;
        this.ano = ano;
    }

    public void metodo1() {
        System.out.println(carroNome + " " + ano);
    }

    public String getCurso() { // get: obtém (ou lê) o valor atual de um atributo.
        return curso;
    }

    public void setCurso(String newCurso) { // set:  modifica o valor de um atributo (seta um novo valor)
        this.curso = newCurso;
    }

    public static void main(String[] args) {

        ClasseTeste obj1 = new ClasseTeste("Pulse", 2025);

        obj1.metodo1(); // chamando o método pelo objeto + metodo

    }
}
