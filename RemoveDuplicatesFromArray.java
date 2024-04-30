package JAva_programming;

import java.util.*;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr); // Sorting array for duplicate removal
        int length = removeDuplicates(arr, size);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
