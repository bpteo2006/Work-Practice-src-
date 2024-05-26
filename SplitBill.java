import java.util.Scanner;

public class SplitBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the bill amount : ");
        float amt = scanner.nextFloat();

        System.out.print("How many person are there? ");
        int num = scanner.nextInt();

        float shareamt = (amt / num);

        System.out.format("Each person must pay %.2f ", shareamt);
    }
}
