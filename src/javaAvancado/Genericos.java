package javaAvancado;

import java.util.ArrayList;
import java.util.List;

class Genericos {
}

class Estoque<T> { // o <T> representa um espaço genérico que se pode colocar qlqr tipo de
                   // dado(integer, livros, produto...)
    private List<T> itens = new ArrayList<>();


    public void add(T item) {
        itens.add(item);
    }

    public T get(int index) {
        return itens.get(index);
    }

    public void list() {
        for (T item : itens) {
            System.out.println(item);
        }

    }
}

class Livros {
    String nomeLivro, nomeAutor;
    double valor;

    public Livros(String nomeLivro, String nomeAutor, double valor) {   //essa parte  serve para criar objetos já com os valores preenchido
        this.nomeAutor = nomeAutor;                             //this.nomeLivro → significa "o atributo do objeto chamado nomeLivro"
        this.nomeLivro = nomeLivro;                                //nomeLivro → é o parâmetro que veio de fora (do que você passou)
        this.valor = valor;
    }

    @Override
    public String toString() {             //toString() é um método especial que diz como um objeto deve ser representado em forma de texto.
        return "O nome do livro é: " + nomeLivro +"\n"+ "Autor: " + nomeAutor + "\n"+"Valor: R$" + valor;  
    }

    public static void main(String[] args) {

        Estoque<Livros> objLivros = new Estoque<>(); //<Livros> no lugar de <T>

        objLivros.add(new Livros("Harry Potter", "Matheus", 39.90));
        objLivros.list();

    }

}
