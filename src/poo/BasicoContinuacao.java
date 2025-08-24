package poo;

public class BasicoContinuacao {

    public static void main(String[] args) {

        Basico obj = new Basico(0, 0, null, null); // parâmetros
        obj.polegadas=45;
        obj.ano=2017;
        obj.cor="Preta";
        obj.marca="Samsung";
        obj.ligada=false;

        obj.metodoStatusTv();
        obj.metodoLigar();
        obj.metodoStatusTv();

        
    }

}
