public class Parabola {
    public static void main(String[] args) throws InterruptedException {

        // y = m(x) + b

        double m = 2.0/3.0, b=2;
        int[] x = {0, 1, 2, 3, 4, 5};
        double[] y = {0, 1.0, 4.0, 9.0, 16.0, 25.0};

       for (int i = 0; i < x.length; i++) {
            double y = m * x[i] + b;

            System.out.println("x = " + x[i] + " | y = " + y);
            System.out.println();
            Thread.sleep(1000);
            
       }

     }
 }
