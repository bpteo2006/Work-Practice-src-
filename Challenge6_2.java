import java.util.Scanner;

public class Challenge6_2 {
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


        for (int i = 0; i < 3; i++ ) {
                    String result = "right";
                    if ((i==0) && (answer[0]==false)) {
                        result = "wrong";
                    }

                    if ((i==1) && (answer[1]==true)) {
                        result = "wrong";
                    }

                    if ((i==2) && (answer[2]==false)) {
                        result = "wrong";
                    }

                System.out.println("Answer "+answer[i]);
                System.out.println("You got question "+i+" "+result);
        }
    }
}
