package code_wars;

public class PositionAverage4 {

    public static void main(String[] args) {
        System.out.println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096")); // Output:26.6666666667
        System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490")); // Output:29.2592592593
        System.out.println(posAverage("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444")); // Output:100
    }
	
	
    public static double posAverage(String s) {
        String replace;
        replace = s.replaceAll("[^0-9 ]", "");
        String[] stringsarray = replace.split(" ");
        double answer = 0;
        double lengthx = (stringsarray.length * (stringsarray.length - 1)) / 2 * (stringsarray[0].length());
        for (int i = 0; i < stringsarray.length; i++) {
            for (int j = i + 1; j < stringsarray.length; j++) {
                for (int n = 0; n < stringsarray[0].length(); n++) {
                    if (stringsarray[i].charAt(n) == stringsarray[j].charAt(n)) {
                        answer++;
                    }
                }

            }
        }

        return (answer / lengthx) * 100;
	}

}
