package ClassesEObjetos;
public class MainImobiliaria {

	public static void main(String[] args) {
		
		Imobiliaria i1 = new Imobiliaria("Falcão", 3, 1, 2, 120, false, true, false);
		System.out.print(i1);
		
		Imobiliaria i2 = new Imobiliaria("Falcão", 15, 8, 3, 2, 3,  82, true, false, false);
		System.out.print(i2);
		
		Imobiliaria i3 = new Imobiliaria("Leblon", 6, 3, 5, 540, true, true, true);
		System.out.print(i3);
		
		Imobiliaria i4 = new Imobiliaria( "Altaman", 4, 2, 3, 240, true, true, true);
		System.out.print(i4);
		
		Imobiliaria i5 = new Imobiliaria( "Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		System.out.print(i5);
		
	}

}

