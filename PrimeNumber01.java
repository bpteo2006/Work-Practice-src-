import java.util.Scanner;

public class PrimeNumber01 {

    public static void main(String[] args) {


        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int div = 2; div < i; div++) {
                if (i % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}
