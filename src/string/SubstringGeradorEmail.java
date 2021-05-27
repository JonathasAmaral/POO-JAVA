package string;

public class SubstringGeradorEmail {
    
    public String gerarEmail(String nomeCompleto){

        StringBuffer email = new StringBuffer();

        String[] partesNome = nomeCompleto.split(" ");

        for (String parteNome : partesNome) {

            String incialParteNome = parteNome.substring(0,1);
            email.append(incialParteNome);
        }

        email.append("@cin.ufpe.br");

        return email.toString();
    }

    public static void main(String[] args) {
        
        SubstringGeradorEmail subs = new SubstringGeradorEmail();
        String email = subs.gerarEmail("Daniel Abella Cavalcante Mendonca De Souza");

        System.out.println(email);

    }

}