package PA_303_7_1;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("First index: " + arr[0]);
        System.out.println("Last index: " + arr[arr.length - 1]);

        // This line will intentionally throw an Exception
        System.out.println(arr[arr.length]);

        // This line will also throw an Exception if you try it:
        // arr[5] = 100;
    }
}
