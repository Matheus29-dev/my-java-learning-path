package comoUsarJava;

public class EncontrarMenorElemento {

    int numeros[] = { 33, 22, 11, 3, 244, 555, 3333, 66, 7, 2, 1, -1 };
    int menorIdade = numeros[0];

    public void metodoAcharMenorNumero() {
        for (int i : numeros) {
            if (menorIdade > i) {

                menorIdade = i;

            }

        }
        System.out.println("A menor idade é: " + menorIdade);

    }

    public static void main(String[] args) {
        EncontrarMenorElemento obj = new EncontrarMenorElemento();

        obj.metodoAcharMenorNumero();
    }

}
