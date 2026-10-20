import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;

        System.out.println("+--------------------------+");
        System.out.println("|     Palindrome Checker   |");
        System.out.println("+--------------------------+");
        System.out.print("Check word: ");

        // read user input and convert to lowercase
        String startInput = sc.nextLine();
        startInput = startInput.toLowerCase();

        // push each character of startInput into a stack
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < startInput.length(); i++) {
            stack.push(startInput.charAt(i));
        }

        // push each character of startInput into a queue
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < startInput.length(); i++) {
            queue.add(startInput.charAt(i));
        }

        // print the reversed word using stringbuilder
        String reversedWord = new StringBuilder(startInput).reverse().toString();
        System.out.println("Reversed word: " + reversedWord);

        // compare characters from stack and queue
        while (!stack.empty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();

            if (stackChar != queueChar) {
                System.out.println("The word " + startInput + " is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true) {
            System.out.println("The word " + startInput + " is a palindrome.");
        }
        sc.close();
    }
}
