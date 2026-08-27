import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                System.out.print("0");
            } else {
                if (s.charAt(i + 1) == '.') {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
                i++;
            }
        }
        
        System.out.println();
        
        scanner.close();
    }
}