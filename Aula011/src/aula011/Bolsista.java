package aula011;
public class Bolsista extends Aluno {
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do " + this.nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento ao bolsista " + this.nome);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
