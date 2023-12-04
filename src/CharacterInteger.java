public class CharacterInteger {
    public static void main(String[] args) {
        // Uppercase letters
        System.out.println("Uppercase letters:");
        for (char ch = 'A'; ch <= 'C'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }

        // Lowercase letters
        System.out.println("\nLowercase letters:");
        for (char ch = 'a'; ch <= 'c'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }

        // Digits
        System.out.println("\nDigits:");
        for (char ch = '0'; ch <= '2'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }

        // Special symbols
        System.out.println("\nSpecial symbols:");
        char[] symbols = {'$', '*', '+', '/'};
        for (char ch : symbols) {
            System.out.println(ch + ": " + (int) ch);
        }

        // Blank character
        System.out.println("\nBlank character:");
        char blank = ' ';
        System.out.println(blank + ": " + (int) blank);
    }
}
