public class TesteMetodo {

    static void meuMetodo() { // métodos são a mesma coisa que funções
        System.out.println("Testando o método");
    }

    static void testeMetodo(String seuNome, int idade) {
        System.out.println(seuNome + " é daora e " + idade + " anos é topen"); // parâmetro
    }

    static void parametroComIf(int anoNascimento) {
        if (anoNascimento < 2000) {
            System.out.println("Nasceu em " + anoNascimento + " tá véio");
        } else {
            System.out.println("Nasceu em " + anoNascimento + " tá bão");
        }

    }

    static int multiplicador(int x, int y) {
        return x * y;
    }

    static int soma(int a) {
        if (a <= 10 && a>=5) {
            return a + soma(a - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodo(); // fazendo isso para testar o método

        testeMetodo("Mathiola", 20);
        testeMetodo("crmessi", 40); // esse é um teste usando parâmetros

        parametroComIf(2003);
        parametroComIf(1999);

        System.out.println(multiplicador(500, 398));

        int resultado=soma(10);
        System.out.println(resultado);
    }

}
