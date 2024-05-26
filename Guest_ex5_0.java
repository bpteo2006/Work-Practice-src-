import java.util.Scanner;

public class Guest_ex5_0 {
    static String[] guests = new String[10];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
        
        do {

            displayGuests();

            displayMenu();
 
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        //String name = scanner.next();
                        //guests[i] = name;
                        guests[i] = scanner.next();
                        break;
                    }
                }
            } 
            else if (option == 2) {
                System.out.print("Name : ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                       if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }               
            }      
            else if (option == 3) {
                break;
            }
        } while (true);
        System.out.println("Exiting......");
    }

    static void displayGuests() {
        System.out.println("_____________________\n- Guests -\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i] == null? "--" : guests[i]);
        }
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("_____________________\n- Menu -\n");
        //System.out.println("1. Display All Guest.");
        System.out.println("1. Add Guest.");
        System.out.println("2. Remove Guest.");
        System.out.println("3. Exit");
        System.out.print("Option : ");
    }

}