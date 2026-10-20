import java.util.Scanner;

public class mtx2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] array2D = new String[10][10];

        for(int i = 0; i < array2D.length; i++){
            for(int j = 0; j < array2D[i].length; j++){
                array2D[i][i] = "7";
                array2D[j][i] = " ";
            }
        }

        for(int i = 0; i < array2D.length; i++){
            for(int j = 0; j < array2D[i].length; j++){
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

    }

}
