import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge4_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        System.out.print("Guess a number : ");
        int numb = scanner.nextInt();
        if (numb == randomNumber) {
            System.out.print("CORRECT");
        }
        else {
            do {
                if (numb > randomNumber) {
                    System.out.print("Lower ");
                }
                else if (numb < randomNumber){
                    System.out.print("Higher ");
                }
                numb = scanner.nextInt();
            } while (numb != randomNumber);
            System.out.println("CORRECT");
        }
    }
}
