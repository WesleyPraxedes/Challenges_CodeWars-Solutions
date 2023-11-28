package code_wars;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Reverse_or_rotate2 {

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
        Function<String, String> prd = s -> s.chars().map(c -> c - '0').sum() % 2 == 0 ?
                new StringBuilder(s).reverse().toString() : s.substring(1) + s.substring(0, 1);

        return Arrays.stream(str.split("(?<=\\G.{" + sz + "})"))
                .filter(s -> s.length() == sz)
                .map(s -> prd.apply(s))
                .collect(Collectors.joining());

        //return result.toString();
    }
	
}
