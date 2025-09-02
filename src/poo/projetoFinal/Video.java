package poo.projetoFinal;

public class Video implements AcoesVideo {

    private String titulo, avaliacao;
    private int vizualizacoes, curtidads;
    private boolean reproduzindo;
   
    public Video(String titulo, String avaliacao, int vizualizacoes, int curtidads, boolean reproduzindo) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.vizualizacoes = vizualizacoes;
        this.curtidads = curtidads;
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getVizualizacoes() {
        return vizualizacoes;
    }

    public void setVizualizacoes(int vizualizacoes) {
        this.vizualizacoes = vizualizacoes;
    }

    public int getCurtidads() {
        return curtidads;
    }

    public void setCurtidads(int curtidads) {
        this.curtidads = curtidads;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if (this.isReproduzindo()==false) {
            this.setReproduzindo(true);
            System.out.println("Título do vídeo: "+this.getTitulo());
            System.out.println("O vídeo está sendo reproduzido");
            System.out.println("Curtidas: "+this.getCurtidads());
            System.out.println("Avaliação: "+this.getAvaliacao());
            System.out.println("Número de visualizações: "+this.getVizualizacoes());
            
        }else{
            System.out.println("O vídeo já está sendo reproduzido");
        }
        
    }

    @Override
    public void pause() {
        if(this.isReproduzindo()==true){
            System.out.println("Pausado");
        }else{
            this.setReproduzindo(true);
        }
    }

    @Override
    public void darLike() {
        this.setCurtidads(this.getCurtidads()+1);
    }

    

    

}
