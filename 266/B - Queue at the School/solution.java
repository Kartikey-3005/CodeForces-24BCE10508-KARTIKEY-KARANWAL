import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String s = scanner.next();
        
        char[] queue = s.toCharArray();
        
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (queue[j] == 'B' && queue[j + 1] == 'G') {
                    queue[j] = 'G';
                    queue[j + 1] = 'B';
                    j++;
                }
            }
        }
        
        System.out.println(new String(queue));
        
        scanner.close();
    }
}