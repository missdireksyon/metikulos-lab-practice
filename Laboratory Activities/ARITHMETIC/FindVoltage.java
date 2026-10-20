import java.io.Console;

public class FindVoltage {
    public static void main(String[] args) {
        Console con = System.console();
        int current = Integer.parseInt( con.readLine("Enter current: ") );
        int resistance = Integer.parseInt( con.readLine("Enter resistance: ") );
        double voltage = current * resistance;
        System.out.println(voltage);
    }
}