package poo.projetoFinal;

public class Pessoa {
    
    protected String nome, sexo;
    protected int idade, experiencia;
   
    public Pessoa(String nome, String sexo, int experiencia, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.experiencia = experiencia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ganharExp(int xp){

        this.setExperiencia(this.getExperiencia()+xp);

        System.out.println("Agora vc tem "+this.getExperiencia()+" xp!");

    }


    

}
