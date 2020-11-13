package Spotify;


public class  Spotify {

	private Musica[] musicas;
	private int qtidadeMusicas;

	//Construtor sem argumentos
	public Spotify() {
		this(10);
	}
	
	//Construtor com argumentos
	public Spotify(int qtidade) {
		this.musicas = new Musica[qtidade];
		this.qtidadeMusicas = 0;
	}
	
	public void adicionarMusica (Musica m) {
		if (qtidadeMusicas == musicas.length) {
			Musica[] aux = new Musica[2* musicas.length];
			for (int i = 0; i < musicas.length; i++) {
				aux[i] = musicas [i];
			}
			this.musicas = aux;
		}
		musicas[qtidadeMusicas] = m;
		qtidadeMusicas++;
	}

		public int getQtidadeMusicas () {
		return qtidadeMusicas;
	}
	
		public void removerMusicaPorNome (String nome) {
			boolean deslocar = false;
			for (int i = 0; i < this.qtidadeMusicas; i++) {
				if (musicas[i].getNome().equals(nome)) {

					deslocar = true;
				}
				if (deslocar) {
					this.musicas[i] = this.musicas[i+1] ;
				}
			}
		}
		
		public Musica[] listaMusicas (String artista) {
			
			int cont = 0;
			for (Musica m : this.musicas) {
				if (m != null && m.getArtista().equals(artista)) {
					cont++;
				}
			}
			if (cont > 0) {
				
				Musica[] musicasDoArtista = new Musica[cont];
				int i = 0;
				
				for (Musica m : this.musicas) {
					if (m != null && m.getArtista().equals(artista)) {
						musicasDoArtista[i] = m;
						i++;
					}
				}
				return musicasDoArtista;
			} 
			else {
				return null;
			}
		}
}
