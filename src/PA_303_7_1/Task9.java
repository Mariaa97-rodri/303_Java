package PA_303_7_1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);

        System.out.print("Array in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }

        System.out.println("\nThe smallest number is " + arr[0]);
        System.out.println("The biggest number is " + arr[arr.length - 1]);
    }
}