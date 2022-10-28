package aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto(); // novo objeto de controle remoto

        c.setLigado(true); //ligar controle
        c.maisVolume(); //aumentar volume
        c.abrirMenu(); // abrir menu
    }
}
