package poo;

public class ControleTv implements Tv {

    private int volume;
    private boolean ligado, saindoSom;

    public ControleTv(int volume, boolean ligado, boolean saindoSom) {
        this.volume = 10;
        this.ligado = false;
        this.saindoSom = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isSaindoSom() {
        return saindoSom;
    }

    public void setSaindoSom(boolean saindoSom) {
        this.saindoSom = saindoSom;
    }

    @Override
    public void aumentarVolume(int fim) {
        for (int i = getVolume(); i <= fim && i <= 100; i++) {

        }
        setVolume(fim);
    }

    @Override
    public void desligarTv() {
        this.setLigado(false);
        System.out.println("A tv será desligada");
    }

    @Override
    public void diminuirVolume(int fim) {
        for (int i = getVolume(); i >= fim && i >= 0; i--) {

        }
        setVolume(fim);
    }

    @Override
    public void ligarTv() {
        this.setLigado(true);
        this.setSaindoSom(true);
        System.out.println("Ligando tv...");

    }

    @Override
    public void menuTv() {
        if (isLigado()) {
            System.out.println("\n--- MENU DA TV ---");
            System.out.println("Volume: " + getVolume());
            System.out.println("Modo som: " + isSaindoSom());
            for (int i = 0; i < getVolume(); i++) {
                System.out.print("|");
            }
            System.out.println(" ");

        } else {
        }

    }

    @Override
    public void mudo() {
        if (isSaindoSom()) {
            this.setSaindoSom(false);
            System.out.println("Mudo");

        } else {
            this.setSaindoSom(true);
            System.out.println("Som: " + getVolume());
        }

    }

}
