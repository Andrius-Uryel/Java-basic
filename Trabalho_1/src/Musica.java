public class Musica {
	private String titulo; 
	private int duracao;
	private String qualidade;
	private int ano;
	private Interprete interprete;
			
	public Musica(String titulo, int duracao, String qualidade, int ano, Interprete interprete) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.qualidade = qualidade;
		this.ano = ano;
		this.interprete = interprete;
	}	
	
	public Musica() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Interprete getInterprete() {
		return interprete;
	}

	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}

	public void exibir() {
		System.out.println("Título: " + titulo);
		System.out.println("Interpretada por: " + interprete.getNome());
		System.out.println("Qualidade: " + qualidade);
		System.out.println(ano + " - " + duracao); 
	}
}
