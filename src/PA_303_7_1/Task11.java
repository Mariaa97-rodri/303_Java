package PA_303_7_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many favorite things do you have? ");
        int size = sc.nextInt();
        sc.nextLine(); // Clear the buffer

        String[] favorites = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter your thing: ");
            favorites[i] = sc.nextLine();
        }

        System.out.println("Your favorite things are:");
        for (String thing : favorites) {
            System.out.print(thing + " ");
        }
        sc.close();
    }
}