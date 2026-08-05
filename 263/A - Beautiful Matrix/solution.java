import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = 0;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int num = scanner.nextInt();
                
                if (num == 1) {
                    moves = Math.abs(i - 3) + Math.abs(j - 3);
                }
            }
        }
        
        System.out.println(moves);
        
        scanner.close();
    }
}