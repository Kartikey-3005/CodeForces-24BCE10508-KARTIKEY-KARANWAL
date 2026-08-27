import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        if (x % 5 == 0) {
            System.out.println(x / 5);
        } else {
            System.out.println((x / 5) + 1);
        }
        
        scanner.close();
    }
}