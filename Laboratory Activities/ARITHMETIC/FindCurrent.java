import java.io.Console;

public class FindCurrent {
    public static void main(String[] args) {
        Console con = System.console();
        int voltage = Integer.parseInt( con.readLine("Enter voltage: ") );
        int resistance = Integer.parseInt( con.readLine("Enter resistance: ") );
        double current = (double) voltage / resistance;
        System.out.println(current);
    }
}