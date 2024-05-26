import java.util.Scanner;

public class Challenge6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of students ? ");
        int numb = scanner.nextInt();
        System.out.println("Higher possible marks ? ");
        double max = scanner.nextDouble();
        double[] score = new double[numb];
        double total = 0;
        int i = 0;
        boolean isRepeat = false;
        //boolean isRepeat = true;

        for (i = 0; i < numb; i++) {
            if (isRepeat == true) {
                i--;
                isRepeat = false;
            }
            System.out.print("Student "+(i+1)+" marks :");
            score[i] = scanner.nextDouble();
            int j = i;
            if (score[i] > max) {
                isRepeat = true;
                System.out.println("Exceeded max score, pls re-enter");
            }
            if (isRepeat == false) {
                total = total + score[i];
            }
        }
        System.out.println("Total score : "+total);
        System.out.println("Average score : "+(total/i));
    }
}
