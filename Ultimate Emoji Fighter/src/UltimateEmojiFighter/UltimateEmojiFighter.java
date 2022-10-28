package UltimateEmojiFighter;

import java.util.Random;

public class UltimateEmojiFighter {
    public static void main(String[] args) {
        Lutador l[] = new Lutador [6];
        
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 62.9f, 11, 2 ,1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Random lut = new Random ();
        Random fight = new Random ();
        int teste = lut.nextInt(6);
        int teste1 = fight.nextInt(6);
        //l[teste].apresentar();
        
        Luta UEF01 = new Luta();
        UEF01.marcarLuta(l[teste], l[teste1]);
        UEF01.lutar();
    }
    
}
