package aula013;

public class Mamifero extends Animal { // herda dados da classe animal

    protected String corPelo; // variavel de cor do pelo

    @Override
    public void emitirSom() { // metodo para emitir som
        System.out.println("Som do mamifero");
    }

}
