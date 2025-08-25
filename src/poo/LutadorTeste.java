package poo;

public class LutadorTeste {
    public static void main(String[] args) {
        
        Lutador obj1 = new Lutador("Cr7", "Portugal", null, 40, 10, 0, 0, 80, 1.85);
        Lutador obj2 = new Lutador("Messi", "Argentina", null, 38, 0, 0, 0, 68, 1.70);

        obj1.categoria();
        obj1.resultado("W");
        obj1.apresentacaoLutador();
        obj2.categoria();

        //agora vou marcar uma luta conforme montei na classe -> LutaAgregacao <-

        LutaAgregacao ufc = new LutaAgregacao(obj1, obj2, 5, false);
        ufc.marcarLuta(obj1, obj2);
        ufc.luta();
        obj1.apresentacaoLutador();

    }

}
