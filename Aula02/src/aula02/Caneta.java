package aula02;

public class Caneta {

    String modelo; // variavel para indicar modelo
    String cor; // variavel para indicar cor 
    float ponta;// variavel para indicar ponta 
    int carga; // variavel para indicar carga
    boolean tampada; // variavel para indicar se está tampada

    void status() { //metodo para exibir o status da caneta
        System.out.println("uma caneta " + this.cor);
        System.out.println("o modelo é: " + this.modelo);
        System.out.println("a ponta é: " + this.ponta);
        System.out.println("está tampada: " + this.tampada);
    }

    void rabiscar() { // metodo para rabiscar com condições
        if (this.tampada == true) {
            System.out.println("ERRO!! Com tampa não tem como");
        } else {
            System.out.println("Bora rabiscar");
        }
    }

    void tampar() { //metodo para tampar
        this.tampada = true;
    }

    void destampar() { //metodo para tampar a caneta
        this.tampada = false;

    }
}
