package advanced;

public class MainPeople {
	public static void main(String[] args) {
		
		People p1 = new People();
		p1.nome = "Jonathas";
		p1.cpf = "274.564.476-54";
		p1.idade = 19;
		p1.peso = 53.5;
		p1.teste();
		People p2 = new People();
		p2.nome = "Pedro";
		p2.cpf = "254.435.234-43";
		p2.idade = 12;
		p2.peso = 33.5;
        p2.teste();
        People p3 = new People();
		p3.nome = "Julio";
		p3.cpf = "435.824.253-68";
		p3.idade = 22;
		p3.peso = 102.00;
        p3.teste();
	}

}
