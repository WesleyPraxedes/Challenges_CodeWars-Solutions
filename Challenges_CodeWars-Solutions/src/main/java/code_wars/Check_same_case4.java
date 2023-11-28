package code_wars;

public class Check_same_case4 {
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
