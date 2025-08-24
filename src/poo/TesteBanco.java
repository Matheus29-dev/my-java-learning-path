package poo;

public class TesteBanco {
    public static void main(String[] args) {
        Banco obj = new Banco("Matheus", 1, 300, true, "Investimento");

        Banco obj2 = new Banco("Flava", 2, 100, true, "Conta corrente" );
        

    
        obj.metodoAbrirConta();
        obj2.metodoAbrirConta();
        obj.metodoSacar(500);
        obj.metodoPagamentoMensal();
        obj.metodoEncerrarConta();
    }

}
