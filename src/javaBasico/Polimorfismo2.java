public class Polimorfismo2 extends Polimorfismo1 {

    public void somAnimal() {
        System.out.println("có có cóóóó");
    }

    public static void main(String[] args) {

        Polimorfismo1 obj1 = new Polimorfismo1();
        Polimorfismo2 obj2 = new Polimorfismo2();

        obj1.somAnimal();
        obj2.somAnimal();

    }

}
