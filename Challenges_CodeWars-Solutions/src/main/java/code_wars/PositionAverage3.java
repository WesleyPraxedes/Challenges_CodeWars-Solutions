package code_wars;

public class PositionAverage3 {

    public static void main(String[] args) {
        System.out.println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096")); // Output:26.6666666667
        System.out.println(posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490")); // Output:29.2592592593
        System.out.println(posAverage("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444")); // Output:100
    }
	
	
    public static double posAverage(String s) {
    	
        String[] sArray = s.split(", ");
        int add = 0;
        for (int i = 0; i < sArray.length - 1; i++)
          for (int x = i + 1; x < sArray.length; x++) 
            for (int y = 0; y < sArray[0].length(); y++)
              if (sArray[i].charAt(y) == sArray[x].charAt(y))
                add++;
        return (double) add / (sArray.length * (sArray.length - 1) / 2 * sArray[0].length()) * 100;
		
	}

}
