package JAva_programming;

import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
       
        System.out.print("Enter the number of rotations: ");
        int d = scanner.nextInt();
        rotate(arr, d);
       
        System.out.println("Rotated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }
}
