package projetopessoas;

public class Funcionario extends Pessoa { //herda dados da classe pessoa

    private String setor;
    private boolean trabalhando;

    //método construtor padrão
    public void mudarTrabalho() {
        if (this.trabalhando == true) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }

    //métodos getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
