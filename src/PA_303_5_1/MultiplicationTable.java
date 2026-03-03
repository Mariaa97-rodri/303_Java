package PA_303_5_1;

public class MultiplicationTable {
    public static void main(String[]args) {
        //Outer loop for rows
        for(int i = 1; i <= 12; i++) {
            //inner loop for columns
            for (int j = 1; j <=12; j++) {
                //Print the product with formatting
                System.out.printf("%4d", i * j);
            }
            //Move to the next line after each row is complete
            System.out.println();
        }

    }
}
