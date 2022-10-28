package aula012;

public class Reptil extends Animal {//classe reptil herda dados da classe animal

    private String corEscama; // variável de cor da escama

    @Override
    public void locomover() { // metodo para usar locomover
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() { // metodo para usar alimentar
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() { // metodo para emitir som
        System.out.println("Som de reptil");
    }

    public String getCorEscama() { // metodo para pegar cor da escama
        return corEscama;
    }

    public void setCorEscama(String corEscama) { // metodo para setar cor da escama
        this.corEscama = corEscama;
    }

}
