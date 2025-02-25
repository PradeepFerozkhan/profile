import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner palindromeWord = new Scanner(System.in);
        
        System.out.println("Check the given word is Palindrome or Not, \nEnter the Word : ");
        String word = palindromeWord.nextLine();
        word = word.toLowerCase();

        boolean PalindromePort = true;

        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                PalindromePort = false;
                break;
            }
        }
        if (PalindromePort) {
            System.out.println("The word '" + word + "' is a Palindrome Word!");
        } else {
            System.out.println("The word '" + word + "' is not a Palindrome Word!");
        }
        palindromeWord.close();
    }
    
}
