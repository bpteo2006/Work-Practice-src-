import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge4_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        int i = 0;
        System.out.print("Guess a number : ");
        int numb = scanner.nextInt();
        if (numb == randomNumber) {
            i++;
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
                i ++;
                numb = scanner.nextInt();
            } while (numb != randomNumber);
            System.out.println("CORRECT");
            System.out.format("You took %d attempts to guess it right", i);
        }
    }
}
