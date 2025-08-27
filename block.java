import java.io.*;
import java.util.*;
public class block {
    public static int B;
    public static int H;
    public static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        try {
            B = sc.nextInt();
            H = sc.nextInt();
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");}
        } catch (Exception e) {
            System.out.println(e.toString());
            flag = false;
        } finally {
            sc.close();}}
    public static void main(String[] args) {
        if (flag) {
            System.out.println(B * H);
        } 
    } 
}