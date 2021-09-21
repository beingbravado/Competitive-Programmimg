import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        // int t = scan.nextInt();
        String[] s = br.readLine().trim().split(" ");
        int t = Integer.parseInt(s[0]);
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Integer[] a = new Integer[n];
            String[] array = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(array[i]);
            Arrays.sort(a, Collections.reverseOrder());
            long sum1 = a[0], sum2 = 0, x = 1, y = 0;
            for (int i = 1; i < n; i++) {
                if (sum1 <= sum2 && sum1 + a[i] >= sum2) {
                    sum1 += a[i];
                    x++;
                } else {
                    sum2 += a[i];
                    y++;
                }
            }
            System.out.println(String.format("%.9f", (double) sum1 / x + (double) sum2 / y));
            // System.out.println(sum1 + " " + sum2);
        }
        System.out.println(sb);
    }
}
