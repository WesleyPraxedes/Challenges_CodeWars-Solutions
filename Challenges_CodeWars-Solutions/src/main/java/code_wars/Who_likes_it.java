package code_wars;

public class Who_likes_it {
	

    public static String whoLikesIt(String[] names) {
        if (names == null || names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            int remaining = names.length - 2;
            return names[0] + ", " + names[1] + " and " + remaining + " others like this";
        }
    }

    public static void main(String[] args) {
        // Exemplos de uso
        System.out.println(whoLikesIt(new String[]{})); // "no one likes this"
        System.out.println(whoLikesIt(new String[]{"Peter"})); // "Peter likes this"
        System.out.println(whoLikesIt(new String[]{"Jacob", "Alex"})); // "Jacob and Alex like this"
        System.out.println(whoLikesIt(new String[]{"Max", "John", "Mark"})); // "Max, John and Mark like this"
        System.out.println(whoLikesIt(new String[]{"Alex", "Jacob", "Mark", "Max"})); // "Alex, Jacob and 2 others like this"
    }
    
    

}
