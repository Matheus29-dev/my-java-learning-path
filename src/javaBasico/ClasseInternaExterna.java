class ClasseInternaExterna {
    int a = 10;

    static class Interna { //para rodar o main na classe interna, ela precisa estar com o static
        int b = 30;
    }

    public static void main(String[] args) {
        ClasseInternaExterna obj = new ClasseInternaExterna();
        Interna obj2 = new Interna();
        System.out.println(obj.a + obj2.b);
    }

}
