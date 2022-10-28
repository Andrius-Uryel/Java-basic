package aula05;

public class Aula05 { // classe principal

    public static void main(String[] args) {
        Conta c1 = new Conta("Andrius", 123456); // novo objeto conta

        c1.abrirConta("poup", "BB"); // abrindo conta do objeto c1
        c1.sacar(35); // sacando na conta c1
        c1.pagarMensal(); //pagando mensalidade na conta c1
        c1.situacao(); // exibindo situação da conta c1

    }

}
