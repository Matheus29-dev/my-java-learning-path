package estruturaDeDados;

import java.util.HashMap;

public class MapHash1 {
    public static void main(String[] args) {
        HashMap<String, String> objCapital = new HashMap<>();

        objCapital.put("Madrid", "Espanha");
        objCapital.put("Brasília", "Brasil");
        objCapital.put("Moscow", "Russia");

        System.out.println(objCapital.get("Brasília"));

        System.out.println(objCapital);

    }

}
