// import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        int num = 27391;
        int k = -22;
        rotationMethod1(num, k);
        rotationMethod2(num, k);
    }

    public static void rotationMethod1(int num, int k) {
        int numLength = (countNumberOfDigits(num));
        k = k % numLength;
        if (k < 0) {
            k = k + numLength;
        }

        for (int i = 0; i < k; i++) {
            int remainder = num % 10;
            int quotient = num / 10;
            num = quotient + (remainder * (int) Math.pow(10, (numLength - 1)));
        }
        System.out.println(num);
    }

    public static void rotationMethod2(int num, int k) {
        int numLength = countNumberOfDigits(num);

        k = k % numLength;
        if (k < 0) {
            k = k + numLength;
        }

        int multiplier = 1;
        int divisor = 1;
        for (int i = 1; i <= numLength; i++) {
            if (i <= k) {
                divisor = divisor * 10;
            } else {
                multiplier = multiplier * 10;
            }
        }

        int quotient = num / divisor;
        int remainder = num % divisor;
        int rotatedNum = (remainder * multiplier) + quotient;
        System.out.println(rotatedNum);
    }

    public static int countNumberOfDigits(int num) {
        int numLength = 0;
        while (num > 0) {
            num /= 10;
            numLength++;
        }
        return numLength;
    }
}