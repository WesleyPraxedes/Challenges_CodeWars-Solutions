package code_wars;

public class Check_same_case {
	
    public static int sameCase1(char char1, char char2) {
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
	
    
    public static int sameCase2(char char1, char char2) {
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
	    
    
    public static int sameCase3(char a, char b) {
        if ((Character.isLowerCase(a) && Character.isLowerCase(b)) || (Character.isUpperCase(a) && Character.isUpperCase(b))) {
            return 1;
        } else if (Character.isLetter(a) && Character.isLetter(b)) {
            return 0;
        } else {
            return -1;
        }
    }
    
	public static int sameCase(char a, char b) {
		if ((Character.isLowerCase(a) && Character.isLowerCase(b)) ||
		    (Character.isUpperCase(a) && Character.isUpperCase(b))) {
			return 1;
		}

		return Character.isLetter(a) && Character.isLetter(b) ? 0 : -1;
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