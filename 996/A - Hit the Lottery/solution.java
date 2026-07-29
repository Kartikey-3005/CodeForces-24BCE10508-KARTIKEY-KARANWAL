import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int count = 0;
        
        count += n / 100;
        n %= 100;
        
        count += n / 20;
        n %= 20;
        
        count += n / 10;
        n %= 10;
        
        count += n / 5;
        n %= 5;
        
        count += n;
        
        System.out.println(count);
        
        scanner.close();
    }
}