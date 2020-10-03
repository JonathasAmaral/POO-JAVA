package Twitter;

public class Data {

	private short dia, mes, ano;
	
	public Data(){}
	
	public Data(short dia,short mes,short ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	
	public short getDia() {
		return dia;
	}
	
	public short getMes() {
		return mes;
	}
	public short getAno() {
		return ano;
	}
}
