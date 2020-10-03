package Twitter;

public class Twitter {
     
	private Post [] posts; 
	private int quantidadePosts;
	
	public Twitter(){
		this.posts = new Post[10];
	}
	
	public void adicionarPost(Post post) {  // verifica se a espaço, se não tiver o tamanho do array é duplicado 
		if (quantidadePosts >= posts.length) {
			Post[] postsAux = new Post[2 * quantidadePosts];
			
			for (int i = 0; i < quantidadePosts; i++) {
				postsAux[i] = posts[i];
			}
			this.posts = postsAux;
		}
		
		this.posts[quantidadePosts] = post;
		this.quantidadePosts++;
	}

	
	public void adicionarPost(String conteudo, String autor, Data criacao) {
		this.adicionarPost(new Post(conteudo, autor, criacao));
	}
	
	public int getQuantidadePosts() {
		return quantidadePosts; // chama quantidadePosts
		
	}
	public int getQuantidadePostsDentroDosLimites() {
		return getQuantidadePosts();
	}
	
	public Post[] getPostsAutor(String autor) {
		// conta quantos posts tem 
		int contador = 0;
		for (int i = 0; i < quantidadePosts; i++) {
			if (this.posts[i].getAutor().equals(autor)) {
				contador++;	
				}
			}
		if (contador == 0) {
			return null;  // nulo
		}
		else {
			Post[] postsAutor = new Post[contador];
			int ind = 0;
			for (int i = 0; i < quantidadePosts; i++) {
				if (this.posts[i].getAutor().equals(autor)) {
					postsAutor[ind] = this.posts[i];
					ind++;
				}
	        }
			return postsAutor;
	    }
	}
	public Post[] getPostsComPalavra(String palavra) {
		Post [] postsAutor = getPostsAutor(palavra); // quando não tem nada relacionado a palavra 
		if (postsAutor == null) {
			return null;
		}
		else // quando encontra a palavra em um post
			return postsAutor;
	}

	public Post removePostMaisAntigo(String autor) { // remove o post mais antigo
		Post [] postsAutor = getPostsAutor(autor);
		Post postMaisAntigo = null;
		if (postsAutor!=null) {
			postMaisAntigo = postsAutor[0];   // se não tiver post, ele retorna null
		} else {
			return null;
		}
		for(Post p : postsAutor) {
			postMaisAntigo = getPostMaisAntigo(postMaisAntigo, p);
		}
		return postMaisAntigo;
	}
	
	private Post getPostMaisAntigo(Post p1, Post p2) {  // Encontrar qual foi o post mais antigo
		if (p1.getCriacao().getAno() < p2.getCriacao().getAno()) // compara o ano
			return p1;
		
		else if (p1.getCriacao().getAno() > p2.getCriacao().getAno())  // compara o ano
			return p2;
		
		else if (p1.getCriacao().getMes() < p2.getCriacao().getMes()) // compara o mes
			return p1;
		
		else if (p1.getCriacao().getMes() > p2.getCriacao().getMes()) // compara o mes
			return p2;
		
		else if (p1.getCriacao().getDia() < p2.getCriacao().getDia()) // compara o dia 
			return p1;
		
		else 
			return p2;  
	}
}
