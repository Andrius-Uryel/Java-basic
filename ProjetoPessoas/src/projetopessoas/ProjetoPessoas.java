package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        // programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor ();
        Funcionario p4 = new Funcionario ();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setIdade(25);
        p4.setIdade(30);
        p2.setSexo("M");
        
        p2.setCurso("Analise de sistemas");
        p3.setSalario(3860.99f);
        p4.setSetor("Limpeza");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
