package aula012;

public class Peixe extends Animal { //clase peixe herda dados da classe animal

    private String corEscama; // variável da cor da escama

    @Override
    public void locomover() { // método para locomover
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() { // metodo para usar alimentar
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() { // metodo para emitir som
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha() { // metodo para soltar bolha
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() { // metodo para pegar cor da escama
        return corEscama;
    }

    public void setCorEscama(String corEscama) {// metodo para setar cor da escama
        this.corEscama = corEscama;
    }

}
