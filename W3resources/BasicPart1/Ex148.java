package W3resources.BasicPart1;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex148 {

    public static int findFirstUniqueChar(String str) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        HashSet<Character> repeatedChars = new HashSet<>();

        // Track the order and occurrence of characters
        for (char c : str.toCharArray()) {
            if (!repeatedChars.contains(c)) {
                if (!uniqueChars.contains(c)) {
                    uniqueChars.add(c); // First occurrence
                } else {
                    uniqueChars.remove((Character) c); // Second occurrence, cast c to Character to remove by object
                    repeatedChars.add(c);
                }
            }
        }

        // Find the index of the first unique character
        return uniqueChars.isEmpty() ? -1 : str.indexOf(uniqueChars.get(0));
    }

    public static void main(String[] args) {
        String str = "eeetcode";
        int index = findFirstUniqueChar(str);

        if (index != -1) {
            System.out.println("The index of the first unique character is: " + index);
        } else {
            System.out.println("No unique character found.");
        }
    }
}


