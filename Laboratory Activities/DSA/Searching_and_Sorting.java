import java.util.Arrays;
public class Searching_and_Sorting {
    public static void main(String[] args) {

    //A university bookstore recorded daily sales of textbooks:
        int [] sales = {56, 23, 87, 12, 65, 34, 78, 19};
        //              0   1   2   3   4   5   6   7
        println("Unsorted Data: " + Arrays.toString(sales));

    // 1. Sort the data using Selection Sort. 
        int i, j, min, temp;

        for (i = 0; i < 4; i++) {
            min = i;
            for (j = i + 1; j < 8; j++) {
                if (sales[j] < sales[min]) {
                    min = j;
                }
            }
            temp = sales[i];
            sales[i] = sales[min];
            sales[min] = temp;
        }

        println("Sorted Data (Selection Sort): ");

        for (i = 0; i < 8; i++) {
            println(sales[i] + " ");
        }

    // 2. Sort the same data using Insertion Sort. 
        for (i = 1; i < 8; i++) {
            temp = sales[i];
            j = i - 1;
            while (j >= 0 && sales[j] > temp) {
                sales[j + 1] = sales[j];
                j--;
            }
            sales[j + 1] = temp;
        }
        println("Sorted Data (Insertion Sort): ");

        for (i = 0; i < 8; i++) {
            println(sales[i] + " ");
        }

    // 3. Search for the value 65 using Linear Search. 

        int target = 65;

        for (int x = 0; x < sales.length; x++) {
            if (sales[x] == target) {
                println("Element " + target + " found at index: " + x);
                break;
            }
        }

        println("Element " + target + " not found in the array.");

    // 4. Count the number of comparisons and swaps.

    }
}

