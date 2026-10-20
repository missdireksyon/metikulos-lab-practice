import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mtx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = new String[5];
		StringBuilder temp2 = new StringBuilder();
		StringBuilder temp = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i) + ": ");
            numbers[i] = input.nextLine();
        }

		for (String string : numbers) {
			temp2.append(string);
		}

        for (int i = temp2.length() - 1; i >= 0; i--) {
            temp.append(temp2.charAt(i));
        }

        System.out.println(temp);

    }

}
