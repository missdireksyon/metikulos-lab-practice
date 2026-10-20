public class Arrays{
    public static void main(String[] args) throws InterruptedException {
        int[] myInt = {5, 3, 4, 21, 5, 7};

        System.out.println("Array Length:" + myInt.length);
        for(int i=0; i<myInt.length; i++){
            System.out.println(myInt[i]);
            Thread.sleep(1000);
        }

    }
}
