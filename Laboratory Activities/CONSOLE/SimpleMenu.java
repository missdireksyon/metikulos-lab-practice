import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner (System.in);
        System.out.printf("\033[H\033[2J");
        System.out.flush();

        int row = 100;
        int column = 11;

        // static void drawFrame(row, column){


        // }

        // ROWS
        for (int x=1; x<=100; x++){
            System.out.printf("\033[%d;%dH\u2500",0,x); // Vertical start
            System.out.printf("\033[%d;%dH\u2500",3,x);
            System.out.printf("\033[%d;%dH\u2500",5,x);  
            System.out.printf("\033[%d;%dH\u2500",7,x);  
            System.out.printf("\033[%d;%dH\u2500",9,x);         
            System.out.printf("\033[%d;%dH\u2500",11,x);  // Vertical end
        }        

        // COLUMNS
        // y=1; y<=10 is the vertical length
        for (int y=1; y<=11; y++){         
                                   
            System.out.printf("\033[%d;%dH\u2502",y,1); // Horizontal start
            System.out.printf("\033[%d;%dH\u2502",y,5); // Divider
            System.out.printf("\033[%d;%dH\u2502",y,10);            
            System.out.printf("\033[%d;%dH\u2502",y,15);   
            System.out.printf("\033[%d;%dH\u2502",y,20);                     
            System.out.printf("\033[%d;%dH\u2502",y,25); 
            System.out.printf("\033[%d;%dH\u2502",y,30);
            System.out.printf("\033[%d;%dH\u2502",y,35);  
            System.out.printf("\033[%d;%dH\u2502",y,40);
            System.out.printf("\033[%d;%dH\u2502",y,45);
            System.out.printf("\033[%d;%dH\u2502",y,50);
            System.out.printf("\033[%d;%dH\u2502",y,55);
            System.out.printf("\033[%d;%dH\u2502",y,60);
            System.out.printf("\033[%d;%dH\u2502",y,65);
            System.out.printf("\033[%d;%dH\u2502",y,70);
            System.out.printf("\033[%d;%dH\u2502",y,75);
            System.out.printf("\033[%d;%dH\u2502",y,80);
            System.out.printf("\033[%d;%dH\u2502",y,85);
            System.out.printf("\033[%d;%dH\u2502",y,90);
            System.out.printf("\033[%d;%dH\u2502",y,95); 
            System.out.printf("\033[%d;%dH\u2502",y,100); // Horizontal end                                                                                                                                                                     
            // Thread.sleep(50);   
        }

        // LABELS
        System.out.printf("\033[%d;%dH\u250c ",0,0);        
        System.out.printf("\033[%d;%dH\u2514 ",11,0);   
        System.out.printf("\033[%d;%dH\u252c ",0,5);
        System.out.printf("\033[%d;%dH\u252c ",0,10);
        System.out.printf("\033[%d;%dH\u252c ",0,15);
        System.out.printf("\033[%d;%dH\u252c ",0,20);
        System.out.printf("\033[%d;%dH\u252c ",0,25);        
        System.out.printf("\033[%d;%dH\u252c ",0,30);
        System.out.printf("\033[%d;%dH\u252c ",0,35);                                        
        System.out.printf("\033[%d;%dH\u252c ",0,40);
        System.out.printf("\033[%d;%dH\u252c ",0,45);
        System.out.printf("\033[%d;%dH\u252c ",0,50);                  
        System.out.printf("\033[%d;%dH\u252c ",0,55);
        System.out.printf("\033[%d;%dH\u252c ",0,60);        
        System.out.printf("\033[%d;%dH\u252c ",0,65);
        System.out.printf("\033[%d;%dH\u252c ",0,70);
        System.out.printf("\033[%d;%dH\u252c ",0,75);
        System.out.printf("\033[%d;%dH\u252c ",0,80);
        System.out.printf("\033[%d;%dH\u252c ",0,85);
        System.out.printf("\033[%d;%dH\u252c ",0,90);            
        System.out.printf("\033[%d;%dH\u252c ",0,95);
        System.out.printf("\033[%d;%dH\u252c ",0,100);               
        
        
            System.out.printf("\033[%d;%dH\u2534 ",5,0);
        System.out.printf("\033[%d;%dH\u252c ",10,0);
        System.out.printf("\033[%d;%dH\u252c ",15,0);
        System.out.printf("\033[%d;%dH\u252c ",20,0);
        System.out.printf("\033[%d;%dH\u252c ",25,0);        
        System.out.printf("\033[%d;%dH\u252c ",30,0);
        System.out.printf("\033[%d;%dH\u252c ",35,0);                                        
        System.out.printf("\033[%d;%dH\u252c ",40,0);
        System.out.printf("\033[%d;%dH\u252c ",45,0);
        System.out.printf("\033[%d;%dH\u252c ",50,0);                  
        System.out.printf("\033[%d;%dH\u252c ",55,0);
        System.out.printf("\033[%d;%dH\u252c ",60,0);        
        System.out.printf("\033[%d;%dH\u252c ",65,0);
        System.out.printf("\033[%d;%dH\u252c ",70,0);
        System.out.printf("\033[%d;%dH\u252c ",75,0);
        System.out.printf("\033[%d;%dH\u252c ",80,0);
        System.out.printf("\033[%d;%dH\u252c ",85,0);
        System.out.printf("\033[%d;%dH\u252c ",90,0);            
        System.out.printf("\033[%d;%dH\u252c ",95,0);
        System.out.printf("\033[%d;%dH\u252c ",100,0);    

        // y = 5 yung pagitan

        System.out.printf("\033[%d;%dHNAME ",2,3);   

        System.out.printf("\033[%d;1H",100);
    }
}
