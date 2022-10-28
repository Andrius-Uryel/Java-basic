/**
*
* @author Andrius Uryel 
*/
package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        //Primeiro objeto curso, setado via código
        Curso c01 = new Curso();
        c01.setNome("Analise e desenvolvimento de sistemas");
        c01.setNum(18);
        c01.setPub("Experiente");
        c01.setAno(2012);
        //Primeiro objeto instrutor, setado via código
        Instrutor i01 = new Instrutor();
        i01.setNome("Andrius dos Santos");
        i01.setEmail("andrius@cursos.com");
        
        c01.setInst(i01); // Associando instrutor ao curso
        System.out.println("*********************"); // separador
        c01.exibeCurso(); // Exibir informações do curso
        System.out.println("*********************"); // separador
        
        
        Scanner entrada = new Scanner(System.in); // Aceitação de dados 1
        Scanner entradaString = new Scanner(System.in); // Aceitação de dados 2
        Curso c1 = new Curso(); // Objeto Curso que será aceito digitação do usuário
        Instrutor i1 = new Instrutor(); // Objeto Instrutor que será aceito via digitação do usuário

        System.out.println("Digite o nome do curso: ");
        c1.setNome(entradaString.nextLine()); // Aceitação do nome do curso
        System.out.println("Digite o numero de aulas do curso: ");
        System.out.println("Precisa ser maior que zero");
        int aula = 0; // variavel que recebe inicialmente a digitação do número de aulas
        // Laço que faz a validação sobre a variavel aula, validando se é maior que 0
        do {
            aula = entrada.nextInt(); // Aceitação de dados
            if (aula <= 0) {
                System.out.println("Numero de aulas invalido, insira o numero correto.");
            }
        } while (aula <= 0);
        // Condicional que move o valor da variável aula para o atributo, caso for maior que 0.
        if (aula > 0) {
            c1.setNum(aula);
        }
        System.out.println("Digite o publico alvo (1-Iniciante ou 2-Experiente)");
        int i = 0; // Variável que vai receber valor 1 ou 2
        // Laço que faz a validação sobre a variavel i, quando for diferente de 1 ou 2
        do {
            i = entrada.nextInt(); // Aceitação de dados
            if (i != 1 || i != 2) {
                System.out.println("Codigo invalido, insira o codigo correto.");
            }
        } while (i < 1 || i > 2);
        // Condicional quando valor de i for 1 ou 2
        if (i == 1) {
            c1.setPub("Iniciante");
        } else {
            c1.setPub("Experiente");
        }
        System.out.println("Digite o ano de lançamento: ");
        System.out.println("OBS.: Precisa ser maior que 1980 e no maximo 2022");
        int lanc = 0; //variavel para validação do ano de lançamento
                // Laço que faz a validação sobre a variavel lanc, quando menor que 1980 ou maior que 2022
        do {
            lanc = entrada.nextInt(); // Aceitação de dados
            if (lanc < 1980 || lanc > 2022) {
                System.out.println("Ano invalido, insira o correto correto.");
            }
        } while (lanc < 1980 || lanc > 2022);
        // Condicional quando ano estiver entre 1980 e 2022
        if (lanc >= 1980 || lanc <= 2022) {
            c1.setAno(lanc);
        }
        // Aceitação de dados do instrutor
        System.out.println("Agora digite os dados do instrutor do curso:");
        System.out.println("Nome do instrutor:");
        i1.setNome(entradaString.nextLine());// Nome do instrutor do curso
        System.out.println("E-mail do instrutor: ");
        i1.setEmail(entradaString.nextLine()); // E-mail do instrutor do curso

        c1.setInst(i1); // Método setter para setar dados aceitos antes no objeto i1.

        c1.exibeCurso(); // Método para exibir informações do curso e instrutor.

    }

}
