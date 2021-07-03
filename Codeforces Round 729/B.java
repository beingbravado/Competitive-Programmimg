import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long a = scan.nextInt();
            long b = scan.nextInt();
            boolean ans = false;

            if (a == 1) {
                if ((n - 1) % b == 0)
                    ans = true;
            } else {
                long num = 1;
                while (num <= n) {
                    if ((n - num) % b == 0) {
                        ans = true;
                        break;
                    }
                    num *= a;
                }
            }
            System.out.println(ans ? "Yes" : "No");
        }
        scan.close();
    }
}