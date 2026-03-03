package PA_303_7_1;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            if (i == 2) {
                continue; // Skip the middle element
            }
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}