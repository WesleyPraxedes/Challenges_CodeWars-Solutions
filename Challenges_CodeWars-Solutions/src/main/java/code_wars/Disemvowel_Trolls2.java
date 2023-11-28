package code_wars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Disemvowel_Trolls2 {

	public static void main(String[] args) {

		 String string1 = "jdsfiotusbhfgjkbdsfgiuaerhfgt";
	        
	        // Defina o padrão regex para encontrar consoantes
	        Pattern pattern = Pattern.compile("[^aeiouAEIOU]");
	        
	        // Crie um objeto Matcher com a string de entrada
	        Matcher matcher = pattern.matcher(string1);
	        
	        // Use o método find() para encontrar todas as correspondências
	        while (matcher.find()) {
	            // Imprima ou manipule as consoantes encontradas
	            System.out.print(matcher.group());
	        }

	}

}
