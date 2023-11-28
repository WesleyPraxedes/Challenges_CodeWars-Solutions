package code_wars;

public class Return_Negative {
	

    public static int makeNegative(int x) {
        // Se x for maior que zero, retorna o negativo de x; caso contrário, retorna x sem alteração
        return (x > 0) ? -x : x;
    }

    public static void main(String[] args) {
        // Exemplos de uso
        System.out.println(makeNegative(1));  // Saída: -1
        System.out.println(makeNegative(-5)); // Saída: -5
        System.out.println(makeNegative(0));  // Saída: 0
    }

}
