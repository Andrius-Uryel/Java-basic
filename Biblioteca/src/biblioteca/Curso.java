/**
*
* @author Andrius Uryel 
*/

package biblioteca;

public class Curso {

    private String nome; // Nome do curso
    private int num; //Numero de aulas
    private String pub; //Publico alvo (Iniciante ou experiente)
    private int ano; // ano de lançamento
    private Instrutor inst; // Instrutor do curso
    private Aula aula;

    // Contrutor sem parâmetros
    public Curso() {
        this.inst = new Instrutor();
    }

    // Contrutor com alguns parâmetros
    public Curso(String nome, int num, String pub, int ano) {
        this.nome = nome;
        this.num = num;
        this.pub = pub;
        this.ano = ano;
        this.inst = new Instrutor();
    }

    // Contrutor com todos parâmetros
    public Curso(String nome, int num, String pub, int ano, Instrutor inst, Aula aula) {
        this.nome = nome;
        this.num = num;
        this.pub = pub;
        this.ano = ano;
        this.inst = inst;
        this.aula = aula;
    }

    //Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Instrutor getInst() {
        return inst;
    }

    public void setInst(Instrutor inst) {
        this.inst = inst;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    // Método para exibir informações do curso
    public void exibeCurso() {
        System.out.println("Curso: " + this.getNome());
        System.out.println("Nº de aulas: " + this.getNum());
        System.out.println("Publico-alvo:" + this.getPub());
        System.out.println("Ano de lancamento: " + this.getAno());
        System.out.println("Instrutor: " + inst.exibirIc());
    }
}
