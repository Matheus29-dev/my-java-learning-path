package javaBasico;

public class HerancaCarro2 extends HerancaVeiculo{
        private final String modelo= "Mustang";

        public static void main(String[] args) {
            
            HerancaCarro2 obj= new HerancaCarro2();
            obj.buzina();

            System.out.println(obj.marca+obj.modelo);
        }
    }
    



