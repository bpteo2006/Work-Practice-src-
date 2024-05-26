import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binarynum1 = sc.nextLine();
        System.out.print("Enter another binary number: ");
        String binarynum2 = sc.nextLine();

        int num1 = Integer.parseInt(binarynum1, 2);
        int num2 = Integer.parseInt(binarynum2, 2);

        int product = num1 * num2;
        System.out.printf("Product of the two binary number is %s ", Integer.toBinaryString(product));
        //System.out.print("Product of the two binary numbers is " + Integer.toBinaryString(product));

    }
}