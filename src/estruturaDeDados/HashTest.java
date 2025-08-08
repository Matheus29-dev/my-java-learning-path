package estruturaDeDados;
import  java.util.HashSet; //hash é mais rápido de se achar um elemento
                            // e não mostram elementos duplicados

public class HashTest {
    public static void main(String[] args) {
        HashSet<Integer> objNumeral = new HashSet<>();


        objNumeral.add(2);
        objNumeral.add(3);
        objNumeral.add(4);
        objNumeral.add(4);

        System.out.println(objNumeral);

        for (int i = 1; i <= 5; i++) {
            if(objNumeral.contains(i)){
                System.out.println("Há esse número " + i );
            }else{
                System.out.println("não há esse número");
            }
            
        }

    }

}
