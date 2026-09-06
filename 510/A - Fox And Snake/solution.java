import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
            } else if (i % 4 == 2) {
                for (int j = 1; j < m; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            } else if (i % 4 == 0) {
                System.out.print("#");
                for (int j = 1; j < m; j++) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}