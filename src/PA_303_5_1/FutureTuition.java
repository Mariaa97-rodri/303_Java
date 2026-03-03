package PA_303_5_1;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Starting tuition
        int years = 0;

        //Loop until tuition hits $20,000 or more
        while (tuition < 20000) {
            tuition = tuition * 1.07; // Increase by 7%
            years++;
        }
        System.out.println("Tuition will be doubled in " + years + "years.");
        System.out.printf("Tuition value: $%.2f", tuition);
    }
}
