package testeArquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivo {
    public static void main(String[] args) {

        File meuObj = new File("ArqvCriadoNoJava.java");

        try {
            if (meuObj.createNewFile()) {
                System.out.println("Arquivo criado: " + meuObj.getName());
                FileWriter objEscreve = new FileWriter("ArqvCriadoNoJava.java");
                objEscreve.write("// O Arquivo foi aberto, boa tentativa!");
                objEscreve.close();
            } else {
                System.out.println("Arquivo já existe");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }

}
