package String;

public class StringUtils {
	
	//"quantidade de questoes" ==> "quantidadeDeQuestoes" 
		public static String formataAtributo(String atributo) {
			//atributo ==> "quantidade de questoes"
			String[] palavras = atributo.split(" ");
			//["quantidade", "de", "questões"]
			
			String atributoFormatado = palavras[0];
			for(int i = 1; i < palavras.length; i++) {
				// palavras[i] ==> "de", "questões"
				char ini = palavras[i].toUpperCase().charAt(0);
				String aux = String.valueOf(ini);
				//aux ==> "D", "Q"
				aux += palavras[i].substring(1);
				//aux ==> "De", "Questões"
				atributoFormatado += aux;
			}
			
			return atributoFormatado;
		}
		
		//"get quantidade de questoes" ==> "getQuantidadeDeQuestoes"
		public static String formataMetodo(String metodo) {
			//"get quantidade de questoes" ==> "quantidadeDeQuestoes"
			String aux = StringUtils.formataAtributo(metodo);
			
			//transformando inicial da String para maiúsculo
			char ini = aux.toUpperCase().charAt(0);	
			//"Q" + "uantidadeDeQuestoes"
			String out = ini+aux.substring(1);
			
			//"get" + "QuantidadeDeQuestoes"
			out = "get"+out; 
			return out;
		}
		
		public static void main(String[] args) {
			System.out.println(StringUtils.formataMetodo("quantidade de questoes"));
			System.out.println(StringUtils.formataAtributo("altura e peso"));
		}
}
