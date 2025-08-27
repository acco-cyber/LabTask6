import java.util.Scanner;
public class formating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // %-15s = left align string in 15 spaces
            // %03d = integer in 3 digits with leading zeros
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }    
}