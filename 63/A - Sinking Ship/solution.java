import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        List<String> rats = new ArrayList<>();
        List<String> womenAndChildren = new ArrayList<>();
        List<String> men = new ArrayList<>();
        List<String> captain = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String status = scanner.next();
            
            switch (status) {
                case "rat":
                    rats.add(name);
                    break;
                case "woman":
                case "child":
                    womenAndChildren.add(name);
                    break;
                case "man":
                    men.add(name);
                    break;
                case "captain":
                    captain.add(name);
                    break;
            }
        }
        
        for (String name : rats) {
            System.out.println(name);
        }
        for (String name : womenAndChildren) {
            System.out.println(name);
        }
        for (String name : men) {
            System.out.println(name);
        }
        for (String name : captain) {
            System.out.println(name);
        }
    }
}