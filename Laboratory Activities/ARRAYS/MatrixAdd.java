public class MatrixAdd {
    public static void main(String[] args) {

        int[] arrayA = {1, 3, 5, 2, 5, 6};
        int[] arrayB = {6, 8, 10, 12, -5, -6};
    
        System.out.println("[ArrayA] + [ArrayB] = [ArrayC]");

        int[] arrayC = {0,0,0,0,0,0};

        for (int row = 0; row < arrayA.length; row++){
            arrayC[row] = arrayA[row] + arrayB[row];
            System.out.printf("[%d] + [%d] = [%d]", arrayA[row], arrayB[row], arrayC[row]);
            System.out.println();
        }
    }
}
