package aula012;

public class Mamifero extends Animal { // classe herda dados da classe animal

    private String corPelo; // variavel da cor do pelo

    @Override
    public void locomover() { // metodo para usar locomover
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() { // metodo para usar alimentar
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() { // metodo para emitir som
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() { // metodo para pegar cor do pelo
        return corPelo;
    }

    public void setCorPelo(String corPelo) { // metodo para setar cor do pelo
        this.corPelo = corPelo;
    }

}
