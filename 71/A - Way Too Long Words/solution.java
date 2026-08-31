import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            int len = word.length();
            
            if (len > 10) {
                System.out.print(word.charAt(0));
                System.out.print(len - 2);
                System.out.println(word.charAt(len - 1));
            } else {
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}