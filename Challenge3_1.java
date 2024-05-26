import java.util.Scanner;
public class Challenge3_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int x = scanner.nextInt();
        System.out.print("Please enter another number : ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("x is bigger than y");
        }
        else if (x < y) {
            System.out.println("x is smaller that y");
        }
        else {
            System.out.println("x and y are the same");
        }

    }
}
