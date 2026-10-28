// Write Java programs to demonstrate primitive data types, variables, type
// conversion, type casting.


public class Exp01 {
    public static void main(String[] args) {
        int a = 10;
        double b = 12.5;
        char c = 'A';
        boolean d = true;
        float f = 2.5f;
        long l = 1000L;

        double converted = a; 
        int casted = (int) b;  

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("Float: " + f);
        System.out.println("Long: " + l);
        System.out.println("Converted: " + converted);
        System.out.println("Casted: " + casted);
    }
}

