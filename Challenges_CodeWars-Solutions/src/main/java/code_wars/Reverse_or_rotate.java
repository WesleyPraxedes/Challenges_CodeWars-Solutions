package code_wars;

public class Reverse_or_rotate {

	public static void main(String[] args) {
        // Exemplos de uso
        System.out.println(revrot("123456987654", 6)); // "234561876549"
        System.out.println(revrot("123456987653", 6)); // "234561356789"
        System.out.println(revrot("66443875", 4));     // "44668753"
        System.out.println(revrot("66443875", 8));     // "64438756"
        System.out.println(revrot("664438769", 8));    // "67834466"
        System.out.println(revrot("123456779", 8));    // "23456771"
        System.out.println(revrot("", 8));             // ""
        System.out.println(revrot("123456779", 0));    // ""
        System.out.println(revrot("563000655734469485", 4)); // "0365065073456944"
		
	}
	

    public static String revrot(String str, int sz) {
        // Verificações iniciais
        if (str == null || str.isEmpty() || sz <= 0 || sz > str.length()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        // Divide a string em pedaços de tamanho sz
        for (int i = 0; i <= str.length() - sz; i += sz) {
            String chunk = str.substring(i, i + sz);
            
            // Verifica se a soma dos cubos dos dígitos é divisível por 2
            int sumOfCubes = chunk.chars().map(digit -> (int) Math.pow(Character.getNumericValue(digit), 3)).sum();
            if (sumOfCubes % 2 == 0) {
                // Se divisível por 2, inverte o pedaço
                result.append(new StringBuilder(chunk).reverse());
            } else {
                // Caso contrário, gira uma posição para a esquerda
                result.append(chunk.substring(1)).append(chunk.charAt(0));
            }
        }

        return result.toString();
    }
	
}
