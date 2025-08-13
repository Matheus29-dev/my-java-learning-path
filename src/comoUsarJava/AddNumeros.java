package comoUsarJava;

import java.util.Scanner;

public class AddNumeros {
    public static void main(String[] args) {
        int x,y,soma;

        Scanner obj = new Scanner(System.in);   //criando obj para scannear entradas

        System.out.println("Digite um número: ");
        x=obj.nextInt();

        System.out.println("Digite outro numero: ");
        y=obj.nextInt();

        soma=x+y;
        System.out.println("A soma deles é: "+ soma);
    }

}
