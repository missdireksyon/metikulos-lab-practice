import java.util.Scanner;

public class PaySlip {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        int horizantal = 70;
        int vertical = 19;

        //HORIZONTAL
        for(int x = 1; x <= horizantal; x++) {
            System.out.printf("\033[%d;%dH-",1,x);
            System.out.printf("\033[%d;%dH-",3,x);
            System.out.printf("\033[%d;%dH-",5,x);
            System.out.printf("\033[%d;%dH-",7,x);
            System.out.printf("\033[%d;%dH-",9,x);
            System.out.printf("\033[%d;%dH-",11,x);
            System.out.printf("\033[%d;%dH-",13,x);
            System.out.printf("\033[%d;%dH-",15,x);
            System.out.printf("\033[%d;%dH-",17,x);
            System.out.printf("\033[%d;%dH-",19,x);
        }

        //VERTICAL
        for(int y = 1; y <= vertical; y++) {
            System.out.printf("\033[%d;%dH|",y,1);
            System.out.printf("\033[%d;%dH|",y,20);
            System.out.printf("\033[%d;%dH|",y,horizantal);
        }

        //CORNER
        for(int y = 1; y <= vertical; y+=2) {
            System.out.printf("\033[%d;%dH+",y,1);
            System.out.printf("\033[%d;%dH+",y,20);
            System.out.printf("\033[%d;%dH+",y,horizantal);
        }

        //LABEL
        System.out.printf("\033[%d;%dHNAME:",2,3);
        System.out.printf("\033[%d;%dHWorkdays:",6,3);
        System.out.printf("\033[%d;%dHRate per Day:",8,3);
        System.out.printf("\033[%d;%dHSalary:",12,3);
        System.out.printf("\033[%d;%dHTax:",14,3);
        System.out.printf("\033[%d;%dHNet Income:",16,3);

        //INPUT
        System.out.printf("\033[%d;%dH",2,22);
        String name = input.nextLine();

        System.out.println();

        System.out.printf("\033[%d;%dH",6,22);
        int workdays = input.nextInt();

        System.out.printf("\033[%d;%dH",8,22);
        int rate = input.nextInt();

        int salary = workdays * rate;
        System.out.printf("\033[%d;%dH%d",12,22,salary);

        float tax = 10.00f;
        System.out.printf("\033[%d;%dH%s",14,22,((int)tax) + "%");

        int income = (int) (salary - (salary * (tax/100)) );
        System.out.printf("\033[%d;%dH%d",16,22,income);

        String pesos = "\u20B1";
        System.out.printf("\033[%d;%dH%s",18,22,pesos + income);

        //TERMINATOR
        System.out.println();
        System.out.printf("\033[%d;%dH",30,1);
    }
}
