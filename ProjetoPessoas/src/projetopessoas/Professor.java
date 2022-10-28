package projetopessoas;

public class Professor extends Pessoa { //herda dados da classe pessoa

    private String especialidade;
    private float salario;

    //método para receber aumento
    public void receberAumento(float aum) {
        this.salario += aum;
    }

    //métodos getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
