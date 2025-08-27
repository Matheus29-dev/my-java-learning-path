package poo;

import java.util.Date;

public class  HerancaPoo {

    private String nomeTime, nacao, cidade;
    private int titulos, anoFundacao;
    private Date dataFundacao;
   
    public HerancaPoo(String nomeTime, String nacao, String cidade, int titulos, int anoFundacao, Date dataFundacao) {
        this.nomeTime = nomeTime;
        this.nacao = nacao;
        this.cidade = cidade;
        this.titulos = titulos;
        this.anoFundacao = anoFundacao;
        this.dataFundacao = dataFundacao;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getNacao() {
        return nacao;
    }

    public void setNacao(String nacao) {
        this.nacao = nacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void ganhouTitulo(){

        this.setTitulos(this.getTitulos()+1);

        System.out.println("Seu número de títulos agora é: "+ this.getTitulos());


    }

    public void testeOverride(){
        System.out.println("Override antigo");
    }

    


}
