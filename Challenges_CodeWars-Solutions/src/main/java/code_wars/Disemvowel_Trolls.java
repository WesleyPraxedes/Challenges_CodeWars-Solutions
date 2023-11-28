package code_wars;

public class Disemvowel_Trolls {

	public static void main(String[] args) {

		 String string1 = "jdsfiotusbhfgjkbdsfgiuaerhfgt";
	        
	        // Substitui todas as vogais por uma string vazia (remove as vogais)
	        String resultado = string1.replaceAll("[aeiouAEIOU]", "");
	        
	        // Imprime o resultado (consoantes)
	        System.out.println(resultado);

	}

}
