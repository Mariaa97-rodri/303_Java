package GLAB_303_2_1;

public class AssigmentOperatorsDemo {
    public static void main(String args[]) {
        //Assigning Primitive Value
        int j, k;
        j = 10; // j gets the value 10
        j = 5; //j gets the value 5. The previous is overwritten
        k = j; // k get the value of 5
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //Multiple Assignments
        k = j = 10; //(k = ((j = 10))
        System.out.println("j is : " + j);
        System.out.println("K is : " + k);
    }
}



