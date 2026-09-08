import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        Arrays.sort(a);
        
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] < 0) {
                sum -= a[i];
            } else {
                break;
            }
        }
        
        System.out.println(sum);
    }
}