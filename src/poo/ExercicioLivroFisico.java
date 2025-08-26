package poo;

public class ExercicioLivroFisico implements ExercicioLivro {

    private String titulo, autor, leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public ExercicioLivroFisico(String titulo, String autor, String leitor, int totPaginas, int pagAtual,
            boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        if (isAberto()) {
            System.out.println("O livro já está aberto");

        } else {
            this.setAberto(true);
            this.setPagAtual(1);
            System.out.println(this.getTitulo());
            System.out.println(this.getAutor());
            System.out.println(this.getPagAtual());

        }

    }

    @Override
    public void avancarPag() {
        if (this.isAberto() && this.getPagAtual() < this.getTotPaginas()) {

            this.setPagAtual(this.getPagAtual() + 1);

        } else {
            System.out.println("Já está na última página");
        }

    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear() {
        if (this.isAberto()) {
            int paginaAleatoria = (int) (Math.random() * this.getTotPaginas() + 1);
            this.setPagAtual(paginaAleatoria);
            System.out.println("Folheando... agora está na página " + this.getPagAtual());

        }

    }

    @Override
    public void voltarPag() {
        if (this.isAberto() && this.getPagAtual()>0) {

            setPagAtual(this.getPagAtual() - 1);

        }else{
            System.out.println("Está na primeira página");
        }

    }

    public void detalhes() {
        System.out.println("------------------");
        System.out.println(this.getTitulo());
        System.out.println(this.getAutor());
        System.out.println(getTotPaginas());
        System.out.println(this.getLeitor());
        System.out.println(this.getPagAtual());
        System.out.println(this.isAberto());
        System.out.println("------------------");



    }

}
