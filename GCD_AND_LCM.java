import java.util.Scanner;

public class GCD_AND_LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = scn.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = scn.nextInt();
        System.out.println(recursive_gcd(n1, n2));
        System.out.println(lcm(n1, n2));
        scn.close();
    }

    public static int gcd(int a, int b) {

        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static int recursive_gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return recursive_gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        /* LCM of a * b = gcd(a , b) * lcm(a, b) */
        return (a * b) / gcd(a, b);
    }
}
