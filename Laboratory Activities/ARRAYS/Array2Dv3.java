import java.util.Scanner;

public class Array2Dv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int[][] arr2D = new int[2][3];

        for (int row=0; row < arr2D.length; row++){
            
            for(int col=0; col < arr2D[0].length; col++){
                System.out.printf("Enter [%d][%d]: ", row, col);
                arr2D[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr2D.length; row++){

            for (int col =0; col < arr2D[row].length; col++){
                System.out.printf("[%d][%d]=%d ", row, col, arr2D[row][col]);
            }
        System.out.println();
        }
    }
}
