package UltimateEmojiFighter;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            System.out.println("===== Luta Marcada =====");
            System.out.println("===== " + this.getDesafiante() + " x " + this.getDesafiado()+ " =====");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            System.out.println("Infelizmentres \" + l1.getNome() + \" e \" + l2e os lutadores " + l1.getNome() + " e " + l2.getNome()+ " nao podem ser lutar");
            System.out.println("Impossivel marcar a luta");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }    
    public void lutar(){
        if (this.aprovada){
            System.out.println("***** DESAFIADO *****");
            this.desafiado.apresentar();
            System.out.println("***** DESAFIANTE *****");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random ();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor){
                case 0: // empate
                    System.out.println("*** EMPATOU ***");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("=================================");
                    System.out.println("***Ganhador: " + this.desafiado.getNome()+ "***");
                    System.out.println("=================================");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("=================================");
                    System.out.println("***Ganhador " + this.desafiante.getNome() + "***");
                    System.out.println("=================================");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else {
            System.out.println("Esta luta nao podera ocorrer");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
