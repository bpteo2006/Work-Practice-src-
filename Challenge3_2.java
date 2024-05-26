import java.util.Scanner;
public class Challenge3_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        //short x = scanner.nextShort();
        float x = scanner.nextFloat();

        System.out.print("Please enter another number : ");
        //short y = scanner.nextShort();
        float y = scanner.nextFloat();

        //short diff = (short) (x - y);
        float diff = (float) (x - y);

        System.out.print("The difference between x and y is ");
        System.out.print(diff);

    }
}
