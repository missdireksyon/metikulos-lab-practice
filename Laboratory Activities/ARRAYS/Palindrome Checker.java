import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  
        // PALINDROME CHECKER
        // Ex. Racecar, Civic, Level

        Scanner sc = new Scanner(System.in);

        System.out.println("+--------------------------+");
        System.out.println("|     Palindrome Checker   |");
        System.out.println("+--------------------------+");
        System.out.print("Enter a word: ");

        String input = sc.nextLine();
        input = input.toLowerCase();

        // converting to char array
        char[] word = input.toCharArray();
        for(int i = 0; i < word.length / 2; i++) {
            char temp = word[i];
            word[i] = word[word.length - 1 - i];
            word[word.length - i - 1] = temp;
        }
;
        System.out.println("Reversed word: " + (String.valueOf(word)));

        if (input.equals(String.valueOf(word))) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

    }
}
