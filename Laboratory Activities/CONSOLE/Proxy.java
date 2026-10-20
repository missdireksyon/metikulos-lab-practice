import java.io.Console;
import java.util.Scanner;

public class Proxy {
    public static void main(String[] args) {

        Console con = System.console();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            double voltage, current, resistance;
            int choice;

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n");
            System.out.println("+--------------------------+");
            System.out.println("|        Ohms Laws         |");
            System.out.println("+--------------------------+");
            System.out.println("| 1.) Find Voltage         |");
            System.out.println("| 2.) Find Current         |");
            System.out.println("| 3.) Find Resistance      |");
            System.out.println("| 0.) Exit                 |");
            System.out.println("+--------------------------+");

            System.out.println(" ");
            System.out.print("Enter choice: ");

            try{
                choice = Integer.parseInt( scanner.next() );
            }catch (Exception e) {
                choice = 10;
            }

            switch (choice) {

                case 1:

                    try {
                        current = Integer.parseInt( con.readLine("Enter current: ") );
                        resistance = Integer.parseInt( con.readLine("Enter resistance: ") );
                        voltage = current * resistance;
                        System.out.println("Voltage (V): " + voltage);
                    }catch(Exception e) {
                        System.out.println("Input Error!");
                    }
                    break;

                case 2:

                    try {
                        voltage = Integer.parseInt( con.readLine("Enter voltage: ") );
                        resistance = Integer.parseInt( con.readLine("Enter resistance: ") );
                        current = (double) voltage / resistance;
                        System.out.println("Current (I): " + current);
                    }catch(Exception e) {
                        System.out.println("Input Error!");
                    }
                    break;

                case 3:

                    try {
                        voltage = Integer.parseInt( con.readLine("Enter voltage: ") );
                        current = Integer.parseInt( con.readLine("Enter current: ") );
                        resistance = (double) voltage / current;
                        System.out.println("Resistance (R): " + resistance);
                    }catch(Exception e) {
                        System.out.println("Input Error!");
                    }
                    break;

                case 0:

                    System.exit(0);
                    break;

                default:

                    System.out.println("Invalid choice");
                    break;

            }

            con.readLine("\nPress <ENTER> to continue...");

        }

    }
}
