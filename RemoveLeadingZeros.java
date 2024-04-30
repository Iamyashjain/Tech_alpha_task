package JAva_programming;

import java.util.Scanner;

public class RemoveLeadingZeros {
    
    public static String removeLeadingZeros(String str) {
        
        int index = 0;
        while (index < str.length() && str.charAt(index) == '0') {
            index++;
        }
        return str.substring(index);
    }
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String result = removeLeadingZeros(str);
        
        System.out.println("Original string: " + str);
        System.out.println("String after removing leading zeros: " + result);
    }

}
