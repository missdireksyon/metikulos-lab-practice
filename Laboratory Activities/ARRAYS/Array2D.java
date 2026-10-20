// import java.io*;

public class Array2D {
    public static void main(String[] args) {
        // int[][] arr2D = new int [11][3];
        int[][] arr2D = {
            {1, 2, 3}, // yung {} indicates which row (horizontal), kung gaano ka daming {}, ganun kadami row
            {4, 5, 6}, // for ex. { {row 1}, {row 2}, {row 3}...} if apat yung line ng {} then apat yung haba ng row
            {7, 8, 9}, // tapos yung value ng nasa {0, 1, 2} indicates column (vertical), kung gaano ka daming value sa loob ng col, ganun kadami col
            {10, 11, 12,} //{ { col 1 (0), col 2 (2), col 3 (2)},  { col 1 (0), col 2 (2), col 3 (2)} }
        };
        // arr2D[5][3] = 0;

        for (int row = 0; row < arr2D.length; row++){

            for(int col = 0; col < arr2D[row].length; col++){
                System.out.printf("[%d][%d]=%d, ", row,col, arr2D[row][col]);
            }
            System.out.println();

        }
    }
}
