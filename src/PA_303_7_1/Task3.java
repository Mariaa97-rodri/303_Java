package PA_303_7_1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Array length: " + colors.length);

        String[] colorsClone = colors.clone();
        System.out.println("Cloned array: " + Arrays.toString(colorsClone));
    }
}
