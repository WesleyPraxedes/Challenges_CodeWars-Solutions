package code_wars;

public class PositionAverage2 {

    public static void main(String[] args) {
        System.out.println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096")); // Output:26.6666666667
        System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490")); // Output:29.2592592593
        System.out.println(posAverage("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444")); // Output:100
    }
	
	
    public static double posAverage(String s) {
    	
		String[] strings = s.split(",");
		int matchs = 0;
		double of = 0;
		for (int i = 0; i < strings.length; i++)
			strings[i] = strings[i].trim();
		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++)
				for (int k = 0; k < strings[i].length(); k++) {
					matchs += (strings[i].charAt(k) == strings[j].charAt(k)) ? 1 : 0;
					of++;
				}
		}
		return matchs * 100 / of;
		
	}

}
