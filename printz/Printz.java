public class Printz {
    public static void main(String[] args){
        // System.out.print("*****\n   * \n  *  \n *   \n*****");
        printZPattern(7);
    }

    public static void printZPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || i + j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
