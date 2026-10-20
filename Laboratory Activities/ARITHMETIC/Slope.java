public class Slope {
    public static void main(String[] args) throws InterruptedException {

        double[] y = new double[9];
        double m = 2.0/3.0, b=2;

        int[] x = {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

       for (int i = 0; i < x.length; i++) {
            y[i] = m * x[i] + b;
            System.out.println("x = " + x[i] + " | y = " + y[i]);
            Thread.sleep(1000);
            
       }

     }
 }

