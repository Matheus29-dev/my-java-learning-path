package poo;

public class PolimorfismoTeste extends Polimorfismo {

    public PolimorfismoTeste(int tamanho, String cor, String estilo, double preco, boolean bonito) {
        super(tamanho, cor, estilo, preco, bonito);
    }

    @Override
    public void testeOverride(){
        System.out.println("Override novo"); // aqui foi usado polimorfismo para modificar o antigo Override
    }

    public static void main(String[] args) {
        
        PolimorfismoTeste obj = new PolimorfismoTeste(40, "azul", "casual", 45.90, true);

        obj.verRoupa();
        obj.verRoupa(30);
        obj.testeOverride();
        
    }

    


}
