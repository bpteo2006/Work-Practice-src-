import java.util.Scanner;

public class Challenge5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] food = new String[5];
        System.out.println("What is your 5 favourite food ? ");
        for (int i = 0; i < 5; i++) {
            int j = i + 1;
            // System.out.format("%d. ",j);
            food[i] = scanner.next();
        }
        System.out.print(food[1]);
        System.out.print(food[2]);
        System.out.print(food[3]);
        System.out.print(food[4]);
        System.out.print(food[5]);
    }
}
