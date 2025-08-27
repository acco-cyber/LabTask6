import java.io.*;
import java.util.*;
public class loop1 {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int currentSum = a;
            for (int j = 0; j < n; j++) {
                currentSum += (Math.pow(2, j) * b);
                System.out.print(currentSum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}