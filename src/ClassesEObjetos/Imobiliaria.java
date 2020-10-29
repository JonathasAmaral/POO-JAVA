package ClassesEObjetos;

public class Imobiliaria {
	
	private String tipo, imobiliaria;
	private int andares, pavimentosAp, quartos, suites, banheiros, metrosQuadrados;
	private boolean elevador, piscina, quadra;
	
	Imobiliaria(){
		
	} 
	
	Imobiliaria(String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra){
		
		this.tipo = "casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
	
	Imobiliaria(String imobiliaria, int andares, int pavimentoAp, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra){
		
		this.tipo = "apartamento";
		this.imobiliaria = imobiliaria;
		this.andares = andares;
		this.pavimentosAp = pavimentoAp;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
	public String getImobiliaria() {
		return imobiliaria;
	}
	public String getTipo() {
		return tipo;
	}
	public int getAndares() {
		return andares;
	}
	public int getPavimentosAp() {
		return pavimentosAp;
	}
	public int getQuartos() {
		return quartos;
	}
	public int getSuites() {
		return suites;
	}
	public int getBanheiros() {
		return banheiros;
	}
	public int getMetrosQuadrados() {
		return metrosQuadrados;
	}
	public boolean getElevador() {
		return elevador;
	}
	public boolean getPiscina() {
		return piscina;
	}
	public boolean getQuadra() {
		return quadra;
	}
	
	
	public int calculaPreco(){
		
		this.metrosQuadrados *= 5000;
		
		if(tipo == "apartamento") {
			for (int i = andares; i >= 5 ; i-- ) {			
				metrosQuadrados += 2000;	
			}			
		}
		
	    if(getElevador() == true) {
	    	
	    	metrosQuadrados += 2500;
	    	
	    }	
		
	    else if(getPiscina() == true) {
	    	
	    	metrosQuadrados += 2500;
	    	
	    }
	    
	    else if(getQuadra() == true) {
	    	
	    	metrosQuadrados += 2500;  	
	    }
	    return metrosQuadrados;
	}
	
	public String toString() {
		String tipoDeImovel = "Tipo = " + getTipo() + ", " + "Imobiliaria = " + getImobiliaria() ;
		String comodosDoImovel = "Numero do andar  = " + getAndares() + ", Nomero do apartamento  = " + getPavimentosAp() + ", Quartos = " + getQuartos() + ", Suites = " + getSuites() + ", Banheiros = " + getBanheiros() + ", Metros Quadrados = " + getMetrosQuadrados() + "m²";
		String adcionais = "Elevador = " + getElevador() + ", Piscina = " + getPiscina() + ", Quadra = " + getQuadra();
		
		return tipoDeImovel  + "\n" + comodosDoImovel  + "\n" + adcionais + "\n" + "Valor total = " + calculaPreco() + "\n \n";
	}
	
}

