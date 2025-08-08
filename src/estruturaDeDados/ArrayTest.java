package estruturaDeDados;
import java.util.ArrayList; //é necessário importar esse arquivo
import java.util.Collections; // usado para classificar pela ordem alfabética ou numérica


public class ArrayTest {
    public static void main(String[] args) {
        
        ArrayList<String> objCarro = new ArrayList<>(); //cria um obj pra representar a array
        objCarro.add("mustang");
        objCarro.add("pulse");
        objCarro.add("ka");                //adiciona valores
        objCarro.add("corolla");

        objCarro.add(1, "ferrari"); // add em um lugar específico

        System.out.println(objCarro);

        objCarro.get(2);  //acessa o elemento
        objCarro.set(2, "Hilux"); // modifica o elemento
        System.out.println(objCarro); // aqui ja está modificado

        objCarro.remove(2); //deleta
        System.out.println(objCarro);

       objCarro.size();
       System.out.println(objCarro.size());

       for (int i = 0; i < objCarro.size(); i++) {

        System.out.println(objCarro.get(i));
           
       }
       Collections.sort(objCarro); //ordena em ordem alfabética
       System.out.println(objCarro);



    }


    
}
