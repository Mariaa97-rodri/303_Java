package GLAB_303_2_1;

public class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
        //explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);

        byte b;
        int z = 257;
        double dou = 323.412;
        System.out.println("Conversion of int to byte. ");
        b = (byte) z;
        System.out.println("z = " + z + "b = " +z);
        System.out.println("Conversion of double double to byte.");

        b = (byte) dou;
        System.out.println("doub = " + dou + "b = " + b);
    }
}
