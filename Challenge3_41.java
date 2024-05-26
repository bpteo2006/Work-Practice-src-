import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Challenge3_41 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first try : ");
        int x = scanner.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        if (randomNumber == x) {
            System.out.print("Correct! Aren’t you lucky.");
        }
        else {
            System.out.print("Hard luck! Please have another go : ");
            int y = scanner.nextInt();
            if (randomNumber == y) {
                System.out.print("Correct! Aren’t you lucky.");
            }
            else {
                System.out.print("Wrong Again! Maybe next time.");
            }

        }
    }
}

