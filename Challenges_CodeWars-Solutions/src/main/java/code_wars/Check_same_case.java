package code_wars;

public class Check_same_case {
	
    public static int sameCase(char char1, char char2) {
        if (!Character.isLetter(char1) || !Character.isLetter(char2)) {
            // Se algum dos caracteres não for uma letra, retorna -1
            return -1;
        } else if (Character.toLowerCase(char1) == Character.toLowerCase(char2)) {
            // Se ambos os caracteres são do mesmo caso, retorna 1
            return 1;
        } else {
            // Se ambos os caracteres são letras, mas não são do mesmo caso, retorna 0
            return 0;
        }
    }    
    

	public static void main(String[] args) {
        // Exemplos de uso
        System.out.println(sameCase('a', 'g')); // Saída: 1
        System.out.println(sameCase('A', 'C')); // Saída: 1
        System.out.println(sameCase('b', 'G')); // Saída: 0
        System.out.println(sameCase('B', 'g')); // Saída: 0
        System.out.println(sameCase('0', '?')); // Saída: -1
	}
}