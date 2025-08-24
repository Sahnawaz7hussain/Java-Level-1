public class Triangle {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            String stars = "";
            for (int j = 1; j <= i; j++) {
                stars += "* ";
            }
            System.out.println(stars);
            ;
        }
    }
}
