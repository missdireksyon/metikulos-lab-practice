import java.io.Console;
import java.util.Scanner;

public class ColorCode_it250333 {

    public static void main(String[] args) {

        Console con = System.console();
        Scanner scanner = new Scanner(System.in);

        int choice1, choice2, choice3, choice4;
        String color1, color2, color3, color4;

        System.out.println("\n");
        System.out.println("+--------------------------+");
        System.out.println("|        Color Code        |");
        System.out.println("+--------------------------+");
        System.out.println("| 0.) Black                |");
        System.out.println("| 1.) Brown                |");
        System.out.println("| 2.) Red                  |");
        System.out.println("| 3.) Orange               |");
        System.out.println("| 4.) Yellow               |");
        System.out.println("| 5.) Green                |");
        System.out.println("| 6.) Blue                 |");
        System.out.println("| 7.) Violet               |");
        System.out.println("| 8.) Gray                 |");
        System.out.println("| 9.) White                |");
        System.out.println("| 10.) Gold                |");
        System.out.println("| 11.) Silver              |");
        System.out.println("| 12.) No Color            |");
        System.out.println("+--------------------------+");

        System.out.print("Enter 1st choice: ");
        choice1 = Integer.parseInt( scanner.next() );
        color1 = getColor(choice1);

        System.out.print("Enter 2nd choice: ");
        choice2 = Integer.parseInt( scanner.next() );
        color2 = getColor(choice2);

        System.out.print("Enter 3rd choice: ");
        choice3 = Integer.parseInt( scanner.next() );
        color3 = getColor(choice3);

        System.out.print("Enter 4th choice: ");
        choice4 = Integer.parseInt( scanner.next() );
        color4 = getColor(choice4);

        double ab = (choice1 * 10) + choice2;
        double dc = Math.pow(choice4, choice3);
        System.out.println(color1 + " " + color2 + " " + color3 + " " + color4);

        if(choice4 == 10) {
            System.out.println((ab * dc));
            System.out.println( (((ab * dc) * 5) / 100) + (ab * dc));
            System.out.println( (((ab * dc) * 5) / 100) - (ab * dc));
        }
        else if(choice4 == 11) {
            System.out.println((ab * dc));
            System.out.println((((ab * dc) * 10) / 100) + (ab * dc));
            System.out.println((((ab * dc) * 10) / 100) - (ab * dc));
        }
        else if(choice4 == 12) {
            System.out.println((ab * dc));
            System.out.println((((ab * dc) * 20) / 100) + (ab * dc));
            System.out.println((((ab * dc) * 20) / 100) - (ab * dc));
        }




    }

    public static String getColor(int choice) {


        switch(choice) {
            case 0:
                try {
                    System.out.print(" Black");
                    System.out.print("\n");
                    return "Black";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 1:
                try {
                    System.out.print(" Brown");
                    System.out.print("\n");
                    return "Brown";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 2:
                try {
                    System.out.print(" Red");
                    System.out.print("\n");
                    return "Red";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 3:
                try {
                    System.out.print(" Orange");
                    System.out.print("\n");
                    return "Orange";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 4:
                try {
                    System.out.print(" Yellow");
                    System.out.print("\n");
                    return "Yellow";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 5:
                try {
                    System.out.print(" Green");
                    System.out.print("\n");
                    return "Green";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 6:
                try {
                    System.out.print(" Blue");
                    System.out.print("\n");
                    return "Blue";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 7:
                try {
                    System.out.print(" Violet");
                    System.out.print("\n");
                    return "Violet";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 8:
                try {
                    System.out.print(" Gray");
                    System.out.print("\n");
                    return "Gray";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 9:
                try {
                    System.out.print(" White");
                    System.out.print("\n");
                    return "White";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 10:
                try {
                    System.out.print(" Gold");
                    System.out.print("\n");
                    return "Gold";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 11:
                try {
                    System.out.print(" Silver");
                    System.out.print("\n");
                    return "Silver";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;

            case 12:
                try {
                    System.out.print(" No Color");
                    System.out.print("\n");
                    return "No Color";
                }catch(Exception e) {
                    System.out.println("Input Error!");
                }
                break;
            default:

                System.out.println("Invalid choice");
                break;

        }

        return "";

    }

}


