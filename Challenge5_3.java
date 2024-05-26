public class Challenge5_3 {
    public static void main(String[] args){
        // double[] a = new a[5];
        double [] a = {1.1, 2.2, 3.3, 4.4, 5.5};
        double sumOfArr = 0;
        double min = 0;

        for (int i = 0; i < 5; i++ ) {
            sumOfArr = sumOfArr + a[i];
            min = sumOfArr / (i+1);
        }
        System.out.print(min);
    }
}
