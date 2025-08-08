package estruturaDeDados;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();

        obj.add("Celta");
        obj.add("Gol");
        obj.add("polo");
        obj.add("ka");

        Iterator<String> it = obj.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        
    }

}
