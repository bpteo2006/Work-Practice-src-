import java.util.Scanner;

public class ListPrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int numb = scanner.nextInt();
        int n;
        int div;
        for (n = 2; n < numb; n++) {
            boolean isPrime = true;
            for (div = 2; div * div < n; div++) {
                if (n % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is prime");
            }
            // System.out.println(div);
        }
    }
}
