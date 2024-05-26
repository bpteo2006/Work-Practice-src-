import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Challenge3_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any number bwtween 1 and 5, inclusive : ");
        int x = scanner.nextInt();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        if (randomNumber == x) {
            System.out.print("Correct! Aren’t you lucky.");
        }
        else {
            System.out.print("Hard luck! Maybe next time.");
        }
    }
}
