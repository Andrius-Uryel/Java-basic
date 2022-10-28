import java.util.Scanner;

public class Biblioteca {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		Musica music1 = new Musica();
		Interprete int1 = new Interprete();
		Interprete int2 = new Interprete("Alok");		
		Musica music2 = new Musica("Ocean", 340, "full", 2020, int2);
				
		//variaveis
		String titulo;
		String qualidade;
		int ano;
		int duracao;
		String nome; 
		//leitura
		System.out.printf("Informe o Escolha o titulo da musica:");
		titulo = leitor.nextLine();
		music1.setTitulo(titulo);
					
		System.out.printf("Informe o interprete:");
		nome = leitor.nextLine();
		int1.setNome(nome);
		music1.setInterprete(int1);
			
		System.out.printf("Informe a qualidade de gravacao:");
		qualidade = leitor.next();
		music1.setQualidade(qualidade);
		
		System.out.printf("Informe o ano de gravacao do hit:");
		ano = leitor.nextInt();
		music1.setAno(ano);
		
		System.out.printf("Informe a duracao da musica em segundos: ");
		duracao = leitor.nextInt();
		music1.setDuracao(duracao);
		
		music1.exibir();
		
		System.out.println("----------------");
		
		music2.exibir();
		
		leitor.close();
		
		
	}
}