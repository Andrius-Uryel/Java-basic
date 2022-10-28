package aula06;

public class ControleRemoto implements Controlador { // classe controle remoto que tem implementada a interface controlador

    private int volume; // variável de volume
    private boolean ligado; // variável para ligar
    private boolean tocando; // variável para tocar

    public ControleRemoto() { //método contrutor com parâmetros
        this.volume = 30;
        this.ligado = false;
        this.tocando = false;

    }

    //métodos especiais
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("***** MENU *****");
        System.out.println("Esta ligado?" + this.getLigado());
        System.out.println("Esta tocando?" + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("[x]");
        }
        System.out.println(" ");
        System.out.println("****************");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            setVolume(30);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            setTocando(false);
        }
    }

}
