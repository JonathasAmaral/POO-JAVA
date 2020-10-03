package Twitter;

public class Post {

	private String conteudo, autor;
	private Data criacao;
	private static int limiteCaracteres;
	
	public Post(){}
	
	public Post(String conteudo, String autor, Data criacao){
		
		this.conteudo = conteudo;
		this.autor = autor;
		this.criacao = criacao;
	}
	
	public String getconteudo() {
		return conteudo;
	}
	
	public String getAutor() {
		return autor;
	}
	public Data getCriacao() {
		return criacao;
	}
	public static int getLimiteCaracteres() {
		return limiteCaracteres;
	}
	
	public String toString() {
		
		return getconteudo()+getAutor()+getCriacao();
	     		
	}
}
