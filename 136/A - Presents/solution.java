import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] result = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int p = scanner.nextInt();
            result[p] = i;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}