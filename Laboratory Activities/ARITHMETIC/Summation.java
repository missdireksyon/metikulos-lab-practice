public class Summation {
    public static void main(String[] args) {
        
        double[] y = {5, 3, 2, 6, 7, 10};
        double sum=0;
        int x=0;

        for(x=0;x<y.length; x++) {
            sum += y[x]*y[x]+1;

            System.out.println("x = " + x + " | Sum = " + sum);
        }
    }

}
