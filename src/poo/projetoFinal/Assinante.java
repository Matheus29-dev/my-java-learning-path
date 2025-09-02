package poo.projetoFinal;

public class Assinante extends Pessoa {

    private String email, senha;

    public Assinante(String nome, String sexo, int experiencia, int idade, String email, String senha) {
        super(nome, sexo, experiencia, idade);
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void viuMaisUmVideo(){

    }


}
