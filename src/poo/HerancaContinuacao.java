package poo;

import java.util.Date;

public class HerancaContinuacao extends HerancaPoo {

    private String corUniforme, nomeCompeticao;

    public HerancaContinuacao(String nomeTime, String nacao, String cidade, int titulos, int anoFundacao,
            Date dataFundacao, String corUniforme, String nomeCompeticao) {
        super(nomeTime, nacao, cidade, titulos, anoFundacao, dataFundacao);
        this.corUniforme = corUniforme;
        this.nomeCompeticao = nomeCompeticao;
    }

    public String getCorUniforme() {
        return corUniforme;
    }

    public void setCorUniforme(String corUniforme) {
        this.corUniforme = corUniforme;
    }

    public String getNomeCompeticao() {
        return nomeCompeticao;
    }

    public void setNomeCompeticao(String nomeCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
    }

    public void infoTime() {
        System.out.println("Nome do time: " + this.getNomeTime());
        System.out.println("Nação: " + this.getNacao());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Total de títulos: " + this.getTitulos());
        System.out.println("Ano de fundação: " + this.getAnoFundacao());
        System.out.println("Data de fundação: " + this.getDataFundacao());
        System.out.println("Cor do uniforme: " + this.getCorUniforme());
        System.out.println("Nome da competição: " + this.getNomeCompeticao());
    }

    @Override
    public void testeOverride(){
        System.out.println("Novo override");
    }

    public static void main(String[] args) {
        
        HerancaContinuacao obj = new HerancaContinuacao("Cruzeiro", "Brasil", "Belo Horizonte", 39, 1921, new Date(), "Azul e Branco", "Brasileirão");
        
        obj.ganhouTitulo();
        obj.infoTime();
        obj.testeOverride();
    }

}
