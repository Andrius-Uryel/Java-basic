package aula013;

public class Cachorro extends Lobo { // herda dados da classe lobo

    @Override
    public void emitirSom() {  // metodo para emitir som
        System.out.println("Au!Au!Au!");
    }

    public void reagir(String frase) { // metodo para regir com condição a frase
        if (frase == "toma comida" || frase == "Olá") {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) { // metodo para reagir com condição ao horário
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) { // metodo para reagir com relação ao dono
        if (dono == true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso) { // metodo para reagir com relação a idade e peso
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
