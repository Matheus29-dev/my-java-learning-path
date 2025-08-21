package javaBasico;

import java.util.Scanner;

public class Testepacote {

    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Coloque seu nome");

        String nomeUsuario = meuObj.nextLine(); // nextLine() lê uma linha inteira de entrada do usuário
        System.out.println("Seu nome é: " + nomeUsuario);

    }
}
