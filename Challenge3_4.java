import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Challenge3_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first try : ");
        int x = scanner.nextInt();
        System.out.print("Please enter another try : ");
        int y = scanner.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        if ((randomNumber == x) || (randomNumber == y)) {
            System.out.print("Correct! Aren’t you lucky.");
        }
        else {
            System.out.print("Hard luck! Maybe next time.");
        }
    }
}
