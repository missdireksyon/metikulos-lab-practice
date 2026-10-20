public class LinearSlope {
        public static void main(String[] args) throws InterruptedException { 
        double[] y = new double[9];
        double m = 2/3, b=2;

        for(int x=-4; x<y.length; x++) y[x]=m*x + b;
        for(int x=4; x<y.length; x++){
            System.out.printf("X=%d | y=%d\n", x, y[x]);
            Thread.sleep(1000);

        }
    }
}
