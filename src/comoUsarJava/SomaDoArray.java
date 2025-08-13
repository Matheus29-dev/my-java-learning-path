package comoUsarJava;

public class SomaDoArray {
    public static void main(String[] args) {

        int[] newArray = { 30, 50, 70, 99 };
        int soma=0;

        for (int i = 0; i < newArray.length; i++) {
            soma += newArray[i];
        }
        System.out.println("A soma de todos é: " + soma);

    }

}
