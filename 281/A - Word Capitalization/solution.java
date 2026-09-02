import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        
        String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
        
        System.out.println(capitalizedWord);
        
        scanner.close();
    }
}