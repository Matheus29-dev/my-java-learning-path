package comoUsarJava;

import java.util.Arrays;

public class MediaArray {
    int soma = 0;
    double media;
    int numeros[] = { 30, 44, 55, 23, 34, 66, 99 };

    public void metodoSoma() {
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos numeros é: " + soma);
    }

    public void metodoMedia() {
        media = soma / numeros.length;
        System.out.println("A média dos numeros é: " + media);
    }

    public void metodoArray() {
        System.out.println(Arrays.toString(numeros));
    }

    public static void main(String[] args) {
        MediaArray obj = new MediaArray();

        obj.metodoArray();
        obj.metodoSoma();
        obj.metodoMedia();

    }

}
