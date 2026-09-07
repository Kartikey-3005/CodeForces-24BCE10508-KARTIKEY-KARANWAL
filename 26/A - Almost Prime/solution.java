import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int almostPrimes = 0;
        
        for (int i = 1; i <= n; i++) {
            int primeFactors = 0;
            
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && isPrime(j)) {
                    primeFactors++;
                }
            }
            
            if (primeFactors == 2) {
                almostPrimes++;
            }
        }
        
        System.out.println(almostPrimes);
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}