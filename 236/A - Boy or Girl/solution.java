import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        
        HashSet<Character> distinctChars = new HashSet<>();
        
        for (int i = 0; i < name.length(); i++) {
            distinctChars.add(name.charAt(i));
        }
        
        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        scanner.close();
    }
}