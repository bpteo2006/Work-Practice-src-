import java.util.Scanner;

public class Challenge6_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer true/false ");

        String[] question = new String[3];
        Boolean[] answer = new Boolean[3];

        for (int i = 0; i < 3; i++ ) {
            switch (i) {
                case 0:
                    question[0] = "Singapore is an island";
                case 1:
                    question[1] = "Singapore is a big country";
                default:
                    question[2] = "Singapore is a tropical country";
            }
            System.out.println(question[i]);
            answer[i] = scanner.nextBoolean();
        }

        String result = "right";
        if (answer[0]==false) {
            result = "wrong";
        }
        System.out.println("Answer "+answer[0]);
        System.out.println("You got question "+1+" "+result);

        result = "right";
        if (answer[1]==true) {
            result = "wrong";
        }
        System.out.println("Answer "+answer[1]);
        System.out.println("You got question "+2+" "+result);

        result = "right";
        if (answer[2]==false) {
            result = "wrong";
        }
        System.out.println("Answer "+answer[2]);
        System.out.println("You got question "+3+" "+result);
    }
}
