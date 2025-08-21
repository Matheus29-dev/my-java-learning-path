package javaBasico;

public interface Interface1 { // usa-se interface pela segurança
    public void metodo1();
}
interface Interface2{
    public void metodo3();
}

class Demonstracao implements Interface1, Interface2{ //com interfaces é possível fazer herança múltipla
     @Override
     public void metodo1(){
        System.out.println("teste");
     }
     @Override
     public void metodo3(){
        System.out.println("another test");
     }

     public static void main(String[] args) {
        Demonstracao obj= new Demonstracao();
        obj.metodo1();
        obj.metodo3();
     }

}
