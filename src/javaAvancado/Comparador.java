package javaAvancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparador implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        boolean aPar = (a % 2) == 0;
        boolean bPar = (b % 2) == 0;

        // Se ambos forem pares ou ímpares, compara pelo valor
        if (aPar == bPar) {
            return Integer.compare(a, b);
        } else {
            // Pares vêm primeiro
            return aPar ? -1 : 1;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers, new Comparador());

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
