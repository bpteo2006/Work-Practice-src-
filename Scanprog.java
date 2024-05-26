import java.util.Scanner;

public class Scanprog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        /* System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded); */

        int twiceOlder = age * 2;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You've lived %d years. In another %d years you'll be %d years old", age, age, twiceOlder);

    }
}

