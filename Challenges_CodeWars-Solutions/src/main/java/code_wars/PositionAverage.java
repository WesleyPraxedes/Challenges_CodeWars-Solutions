package code_wars;

public class PositionAverage {

	public static void main(String[] args) {
        System.out.println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096")); // Output:26.6666666667
        System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490")); // Output:29.2592592593
        System.out.println(posAverage("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444")); // Output:100
    }
	
	

	public static double posAverage(String s) {
		
		// Dividir a string em substrings usando a vírgula como delimitador
        String[] substrings = s.split(", ");
        
        int n = substrings.length;
        int totalPositions = 0;
        int totalMatches = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                totalPositions += substrings[i].length();
                //System.out.println(substrings[i]);

                for (int k = 0; k < substrings[i].length(); k++) {
                    if (substrings[i].charAt(k) == substrings[j].charAt(k)) {
                        totalMatches++;
                    }
                }
            }
        }

        if (totalPositions == 0) {
            return 0.0; // Evitar divisão por zero
        }

        double averagePercentage = (double) totalMatches / totalPositions * 100;
        return averagePercentage;
	}

}
