package projetopessoas;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    //método cancelar matricula
    public void cancelarMatricula() { 
        System.out.println("Matricula sera cancelada");
    }
    
    //métodos getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
