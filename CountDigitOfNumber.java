import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number here: ");
        int num = scn.nextInt();
        scn.close();
        System.out.println(countDigitOfNumber(num));
    }

    public static int countDigitOfNumber(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}