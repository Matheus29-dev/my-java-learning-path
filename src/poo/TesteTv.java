package poo;

public class TesteTv {
    public static void main(String[] args) {
        ControleTv obj1 = new ControleTv(10, false, false);

        obj1.ligarTv();
        obj1.aumentarVolume(70);
        obj1.menuTv();
        obj1.diminuirVolume(15);
        obj1.menuTv();
        obj1.mudo();
        obj1.desligarTv();
        obj1.menuTv();
        obj1.desligarTv();
        
    }

}
