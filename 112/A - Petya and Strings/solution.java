import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next().toLowerCase();
        String str2 = scanner.next().toLowerCase();
        
        int comparison = str1.compareTo(str2);
        
        if (comparison < 0) {
            System.out.println("-1");
        } else if (comparison > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}