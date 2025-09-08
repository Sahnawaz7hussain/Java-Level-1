import java.util.*;

public class FactorsOFNumvers {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = scn.nextInt();
        factors(num);
        scn.close();
    }

    public static void factors(int n) {
        int c = 1;
        while (c <= n) {
            if (n % c == 0) {
                System.out.println(c + " is factor of " + n);
            }
            c++;
        }
    }

}
