abstract class ClasseAbstrata {
    abstract void metodoAbstract();

    public void metodoNormal(){
        System.out.println("Testando método em abstract");
    }
}    

class ClasseNormal extends ClasseAbstrata{
    @Override
    
    void metodoAbstract() {
        System.out.println("Implementação do método abstrato");
    }
    public void metodoTeste(){
        System.out.println("tururuuu");
    }


public static void main(String[] args) {
    ClasseNormal obj = new ClasseNormal();
    obj.metodoNormal();
    obj.metodoTeste();
    obj.metodoAbstract();
}
}


    

