package estruturaDeDados;
import java.util.TreeMap;


public class TreeArvore {

    public static void main(String[] args) {
        
        TreeMap<Integer, String> objNum = new TreeMap<>();  // a diferença do MAP para os outros é que ele classifica
                                                            // em ordem os dados dos vetores

        objNum.put(1, "um");
        objNum.put(3, "três");
        objNum.put(1, "um");
        objNum.put(4, "quatro");
        objNum.put(2, "dois");
        System.out.println(objNum);

    


    }

}
