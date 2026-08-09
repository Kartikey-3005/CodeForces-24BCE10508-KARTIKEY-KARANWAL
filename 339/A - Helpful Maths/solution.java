import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        String[] numbers = s.split("\\+");
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print("+");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}