import java.util.Scanner;

public class PaySlip{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);
        System.out.printf("\033[H\033[2J");
        System.out.flush();

        // ROWS
        for (int x=1; x<=40; x++){
            System.out.printf("\033[%d;%dH\u2500",1,x);
            System.out.printf("\033[%d;%dH\u2500",3,x);
            System.out.printf("\033[%d;%dH\u2500",5,x);  
            System.out.printf("\033[%d;%dH\u2500",7,x);  
            System.out.printf("\033[%d;%dH\u2500",9,x);         
            System.out.printf("\033[%d;%dH\u2500",11,x);     
            System.out.printf("\033[%d;%dH\u2500",13,x);   
            System.out.printf("\033[%d;%dH\u2500",15,x); 
            System.out.printf("\033[%d;%dH\u2500",17,x);                                                                                                    
            // Thread.sleep(50);          
        }        

        // // COLUMNS
        for (int y=1; y<=17; y++){                        
            System.out.printf("\033[%d;%dH\u2502",y,1);
            System.out.printf("\033[%d;%dH\u2502",y,18);  
            System.out.printf("\033[%d;%dH\u2502",y,40);  
            Thread.sleep(50);   
        }

        // // LABELS
        System.out.printf("\033[%d;%dHNAME ",2,3);
        System.out.printf("\033[%d;%dHWORKDAYS ",6,3);
        System.out.printf("\033[%d;%dHRATE PER DAY ",8,3);  
        System.out.printf("\033[%d;%dHSALARY ",12,3);  
        System.out.printf("\033[%d;%dHTAX ",14,3);  
        System.out.printf("\033[%d;%dH10.00%%",14,20);
        System.out.printf("\033[%d;%dHNET INCOME ",16,3);          


        // // USER INPUT
        String name, workdays, rate;

        System.out.printf("\033[%d;%dH",2,20);
        name = sc.nextLine();

        System.out.printf("\033[%d;%dH",6,20);
        workdays = sc.nextLine();
        
        System.out.printf("\033[%d;%dH",8,20);
        rate = sc.nextLine();

        // COMPUTATION

        int salary = Integer.parseInt(workdays) * Integer.parseInt(rate);
        double tax = 10.000;
        System.out.printf("\033[%d;%dH%d",12,20, salary);

        double net = salary - (salary * tax);
        System.out.printf("\033[%d;%dH%d ",16,20,net);         

        // //TOTAL
        System.out.printf("\033[%d;%dH\u20b1%d ",18,20,net);

        sc.close();
        System.out.printf("\033[%d;1H",100);
    }
}