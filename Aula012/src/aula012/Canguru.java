package aula012;

public class Canguru extends Mamifero { // classe canguru herda dados da classe mamifero

    public void usarBolsa() { // metodo para usar bolsa
        System.out.println("Usando a bolsa");
    }

    @Override
    public void locomover() { // metodo para locomover
        System.out.println("Pulando");
    }

}
