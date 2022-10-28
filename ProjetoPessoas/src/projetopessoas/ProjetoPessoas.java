package projetopessoas;

public class ProjetoPessoas {//classe principal

    public static void main(String[] args) {
        // programa principal
        Pessoa p1 = new Pessoa(); //novo objeto pessoa
        Aluno p2 = new Aluno(); //novo objeto aluno
        Professor p3 = new Professor(); //novo objeto professor
        Funcionario p4 = new Funcionario(); //novo objeto funcionario

        //setando nomes
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        //setando idade
        p1.setIdade(25);
        p4.setIdade(30);
        
        //setando sexo
        p2.setSexo("M");

        //setando curso
        p2.setCurso("Analise de sistemas");
        
        //setando salario
        p3.setSalario(3860.99f);
        
        //setando setor
        p4.setSetor("Limpeza");

        //imprimindo informações dos objetos p1 ao p4
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }

}
