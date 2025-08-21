package javaBasico;

public class GetESet {

    public GetESet() {

    } // get e set são métodos que permitem acessar e modificar atributos de uma
      // classe

    public static void main(String[] args) {

        ClasseTeste objetoGetSet = new ClasseTeste("Fusca", 1979);
        objetoGetSet.setCurso("Machine Learning");
        System.out.println(objetoGetSet.getCurso());

    }
}
