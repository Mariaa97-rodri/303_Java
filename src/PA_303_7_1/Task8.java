package PA_303_7_1;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] arr = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        System.out.println("Before swap: " + Arrays.toString(arr));

        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println("After swap:  " + Arrays.toString(arr));
    }
}
