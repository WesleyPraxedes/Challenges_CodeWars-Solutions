package code_wars;

public class Check_same_case2 {
	
    public static int sameCase(char a, char b) {
        if ((Character.isLowerCase(a) && Character.isLowerCase(b)) || (Character.isUpperCase(a) && Character.isUpperCase(b))) {
            return 1;
        } else if (Character.isLetter(a) && Character.isLetter(b)) {
            return 0;
        } else {
            return -1;
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