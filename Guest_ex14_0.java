import java.util.Scanner;

public class Guest_ex14_0 {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        do {

            displayGuests();

            displayMenu();

            int option = getOption();
 
            if (option == 1) {

                addGuest();

                /* for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        //String name = scanner.next();
                        //guests[i] = name;
                        guests[i] = scanner.next();
                        break;
                    }
                } */
            } 
            else if (option == 2) {
                removeGuest();
            }      
            else if (option == 3) {
                break;
            }
        } while (true);
        System.out.println("Exiting......");
    }

    static void displayGuests() {
        int j = 0;
        System.out.println("_____________________\n- Guests -\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            //System.out.println(guests[i] == null? ((i+1)+"--") : ((i+1)+". "+guests[i]));
            //System.out.println((i+1)+" "+(guests[i] == null? "--" : guests[i]));
            
            if (guests[i] != null) {
                System.out.println((i+1)+" "+(guests[i] == null? "--" : guests[i]));
                //j++;
                isEmpty = false;
            }
        }
        //if (j < guests.length) {
        if (isEmpty == true) {
            System.out.println("Guest list is empty");
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

    static int getOption() {
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                //String name = scanner.next();
                //guests[i] = name;
                guests[i] = scanner.nextLine();
                break;
            }
        }

    }

    static void removeGuest() {
        //System.out.print("Name : ");
        System.out.print("Number : ");
        //String name = scanner.next();
        int num = scanner.nextInt();
 
        if (num > 0 && num <=10 && guests[num - 1] != null) {
            guests[num - 1] = null;
        }
        else {
            System.out.println("Error: There is no guest with that number.");
        }
                
        String[] temp = new String[guests.length];
        int ti = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                temp[ti] = guests[i];
                ti++;
            }
        }

        guests = temp;
    }

    static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }

}