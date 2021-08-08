import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        long mod = 1000000007;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] s = new long[n];
        for (int i = 0; i < n; i++)
            s[i] = scan.nextInt();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long x = s[i] - 1;
            ans += x;
            // System.out.println("**"+x);
            for (int j = i + 2; j < n && x > 0; j++, x--) {
                s[j]--;
            }
            ans = (ans + mod) % mod;
        }
        System.out.println(ans);
        scan.close();
    }
}