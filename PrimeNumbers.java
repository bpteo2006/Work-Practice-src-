import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int numb = scanner.nextInt();
        int div;
        boolean isPrime = true;
        for (div = 2; div < numb ; div++) {
            if (numb % div == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Is prime");
            }
            else {
            System.out.println("Not prime");
            //System.out.println(div);
        }
        System.out.println(div);
    }
}
