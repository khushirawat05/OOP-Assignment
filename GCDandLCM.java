import java.util.Scanner;
public class GCDandLCM {

    // LOOP METHOD 

    // 1.GCD using a while loop
    public static int GcdLoop(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // 2.LCM using the loop GCD
    public static int LCMLoop(int a, int b) {
        int gcd = GcdLoop(a, b);
        return (a * b) / gcd;
    }


    // --- RECURSION METHODS ---

    // 3.  GCD using recursion
    public static int GcdRecursion(int a, int b) {
    
        if (b == 0) {
            return a;
        }

        return GcdRecursion(b, a % b);
    }

    // 4. Find LCM using the recursive GCD
    public static int LCMRecursion(int a, int b) {
        int gcd = GcdRecursion(a, b);
        return (a * b) / gcd;
    }


    // --- MAIN METHOD ---

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Numbers: " + num1 + " and " + num2);
        
        System.out.println("GCD: " + GcdLoop(num1, num2));
        System.out.println("LCM: " + LCMLoop(num1, num2));
        
        System.out.println();
        
        System.out.println("GCD: " + GcdRecursion(num1, num2));
        System.out.println("LCM: " + LCMRecursion(num1, num2));
    }
}