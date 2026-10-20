import java.io.Console;

public class FindResistance {
    public static void main(String[] args) {
        Console con = System.console();
        int voltage = Integer.parseInt( con.readLine("Enter voltage: ") );
        int current = Integer.parseInt( con.readLine("Enter current: ") );
        double resistance = (double) voltage / current;
        System.out.println(resistance);
    }
}