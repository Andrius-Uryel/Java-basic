/**
*
* @author Andrius Uryel 
*/
package biblioteca;

public class Instrutor {

    private String nome; // Nome do instrutor
    private String email; // E-mail do instrutor
    private Curso cur; // Curso do instrutor

    // Contrutor sem parâmetros
    public Instrutor() {

    }
    //Contrutor com alguns parâmetros
    public Instrutor(String nome, String email) {
        this.nome = nome;
        this.email = email;
        //this.cur = cur;     
    }
    //Contrutor com todos parâmetros
    public Instrutor(String nome, String email, Curso cur) {
        this.nome = nome;
        this.email = email;
        this.cur = cur;
    }

    //Métodos getters e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Curso getCur() {
        return cur;
    }

    public void setCur(Curso cur) {
        this.cur = cur;
    }
    // Método para exibir todas informações do instrutor
    public void exibirInst() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Curso: " + this.getCur());
    }
    //Método para exibir nome e e-mail do instrutor.
    public String exibirIc() {
        return this.getNome() + " - " + this.getEmail();
    }
}
