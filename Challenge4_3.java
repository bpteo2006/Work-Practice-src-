import java.util.Scanner;

public class Challenge4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = "";
        do {
            System.out.print("Pls enter password : ");
            p = scanner.next();
            if (p.equals("shark50")) {
                System.out.println("ACCESS APPROVED");
                break;
            }
        } while (!p.equals("shark50"));
    }
}
