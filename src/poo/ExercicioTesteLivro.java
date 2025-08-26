package poo;

public class ExercicioTesteLivro {
    public static void main(String[] args) {
        
        ExercicioLivroFisico obj = new ExercicioLivroFisico("O senhor dos aneis", "J.R.R. Tolkien", "Joao", 1000, 0, false);

        obj.abrir();
        obj.avancarPag();
        obj.folhear();
        obj.voltarPag();
        obj.detalhes();

        
    }

}
