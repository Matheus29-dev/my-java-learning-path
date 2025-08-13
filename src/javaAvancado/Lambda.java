package javaAvancado;

import java.util.ArrayList;

public class Lambda {

    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();

        obj.add(2);
        obj.add(0);
        obj.add(2);
        obj.add(5);

        obj.forEach((n) -> System.out.println(n)); // por parâmetro diretamente

    }

}
