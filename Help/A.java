import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        long mod = 1000000007;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] h = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
            sum += h[i];
        }
        long leftOver = sum % n;
        long x = 0, y = 0;
        long mid = sum / n;
        long min = h[0];
        long max = h[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(min, h[i]);
            max = Math.max(max, h[i]);
            if (h[i] < mid)
                x += mid - h[i];
            else
                y += h[i] - mid;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] < mid + 1)
                ans += (mid + 1 - h[i]) * a;
            else
                ans += (h[i] - mid - 1) * b;
            ans = (ans + mod) % mod;
        }

        if (ans > (x * a % mod + y * b % mod) % mod)
            ans = (x * a % mod + y * b % mod) % mod;

        if (ans > ((sum - min * n) * b) % mod)
            ans = ((sum - min * n) * b) % mod;
        if (ans > ((n * max - sum) * a) % mod)
            ans = ((n * max - sum) * a) % mod;

        if (ans > (x * c % mod + leftOver * b % mod) % mod)
            ans = (x * c % mod + leftOver * b % mod) % mod;
        if (ans > (x * c % mod + (n - leftOver) * a % mod) % mod)
            ans = (x * c % mod + (n - leftOver) * a % mod) % mod;

        System.out.println(ans);
        scan.close();
    }
}
