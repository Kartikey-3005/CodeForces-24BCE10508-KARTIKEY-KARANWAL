import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int currentPassengers = 0;
        int maxCapacity = 0;
        
        for (int i = 0; i < n; i++) {
            int exit = scanner.nextInt();
            int enter = scanner.nextInt();
            
            currentPassengers = currentPassengers - exit + enter;
            
            if (currentPassengers > maxCapacity) {
                maxCapacity = currentPassengers;
            }
        }
        
        System.out.println(maxCapacity);
        
        scanner.close();
    }
}