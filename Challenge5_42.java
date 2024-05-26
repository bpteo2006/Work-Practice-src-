import java.util.Scanner;

public class Challenge5_42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[3];
        System.out.println("Pls enter 5 favourite food : ");
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food "+(i+1)+": ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("Your favourite food is :");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
    }
}