/**
*
* @author Andrius Uryel 
*/
package biblioteca;
public class Aula {
    private int numero; //Número de aulas
    private String assunto; //Assunto da aula
    private int tothor; // Total de horas
    //Método construtor padrão
    public Aula (){
        
    }
    //Métodos especiais
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getTothor() {
        return tothor;
    }

    public void setTothor(int tothor) {
        this.tothor = tothor;
    }
    
}
