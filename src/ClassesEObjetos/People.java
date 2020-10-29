package ClassesEObjetos;
// Class
class People {
	
	String nome;
	String cpf;
	int idade;
	double peso;
	
	//Consultor
	People() {
		
		System.out.println("Class People");
		
	} 

	void teste() {
		
		System.out.printf("Nome = %s \n", nome);
		System.out.printf("CPF = %s \n", cpf);
		System.out.printf("Idade = %d \n", idade);
		System.out.printf("Peso = %.2f \n", peso);
		
	}

}
