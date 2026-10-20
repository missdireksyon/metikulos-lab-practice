import java.util.Scanner;

public class Forms{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner (System.in);
        System.out.printf("\033[H\033[2J");
        System.out.flush();


        // ROWS
        for (int x=1; x<=40; x++){
            System.out.printf("\033[%d;%dH\u2500",0,x);
            System.out.printf("\033[%d;%dH\u2500",5,x);
            System.out.printf("\033[%d;%dH\u2500",9,x);  
            System.out.printf("\033[%d;%dH\u2500",13,x);  
            System.out.printf("\033[%d;%dH\u2500",17,x);         
                      System.out.printf("\033[%d;%dH\u2500",22,x);                                           
            Thread.sleep(50);          
        }        

        // COLUMNS
        for (int y=1; y<=21; y++){                        
            System.out.printf("\033[%d;%dH\u2502",y,1);
            System.out.printf("\033[%d;%dH\u2502",y,18);  
            System.out.printf("\033[%d;%dH\u2502",y,40);  
            Thread.sleep(50);   
        }

        System.out.printf("\033[%d;%dHNAME: ",3,8);
        System.out.printf("\033[%d;%dHADDRESS: ",7,6);
        System.out.printf("\033[%d;%dHCONTACT NO: ",11,5);    

        // USER INPUT
        System.out.printf("\033[%d;%dH",3,20);
        String name = sc.nextLine();

        System.out.printf("\033[%d;%dH",7,20);
        String address = sc.nextLine();
        
        System.out.printf("\033[%d;%dH",11,20);
        int contact = sc.nextInt();
        


        sc.close();
        System.out.printf("\033[%d;%dH",50,1);
    }
}