package aula02;

public class Aula02 { // classe principal

    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // novo objeto caneta
        c1.cor = "Azule"; // setando cor da caneta
        c1.tampada = false; // setando se a caneta está tampada
        c1.ponta = 0.5f; // setando ponta da caneta
        c1.modelo = "Canetosa"; // setando modelo da caneta
        c1.tampar(); // tampando a caneta
        c1.rabiscar(); // rabiscando
        c1.status(); // exibindo status
    }

}
