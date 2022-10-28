package aula012;

public class Ave extends Animal {

    /* Classe Ave herda dados da classe Animal e abaixo também tem seus próprios
    * métodos. */

    private String corPena; // variável própria da classe ave

    @Override
    public void locomover() { // método para indicar que a Ava está voando
        System.out.println("Voando");
    }

    @Override
    public void alimentar() { // Método para indicar que a ave está comendo frutas
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() { // Método para indicar que a ave está emtiindo som
        System.out.println("Som de ave");
    }

    public void fazerNinho() { // Método que faz ninho
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() { // método para 'pegar' cor da pena
        return corPena;
    }

    public void setCorPena(String corPena) { // método para setar cor da pena
        this.corPena = corPena;
    }

}
