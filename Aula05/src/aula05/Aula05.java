package aula05;
public class Aula05 {
    public static void main(String[] args) {
        Conta c1 = new Conta ("Andrius", 123456);
        
        c1.abrirConta("poup", "BB");
        c1.sacar(35);
        c1.pagarMensal();
        c1.situacao();
        
    }
    
}
