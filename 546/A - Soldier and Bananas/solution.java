import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        
        int totalCost = 0;
        
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }
        
        int borrow = totalCost - n;
        
        if (borrow < 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }
        
        scanner.close();
    }
}