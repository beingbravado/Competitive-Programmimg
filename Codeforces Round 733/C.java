import java.io.*;
import java.util.Arrays;

public class C {
    public static double solution;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);

            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            String[] s1 = br.readLine().split(" ");
            String[] s2 = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s1[i]);
                b[i] = Integer.parseInt(s2[i]);
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for (int i = n - 2; i >= 0; i--) {
                a[i] += a[i + 1];
                b[i] += b[i + 1];
            }

            int ans = 0;
            if (a[n / 4] < b[n / 4]) {
                int low = 0, high = n;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int k = (n + mid) / 4;
                    if (a[k] + mid * 100 >= b[n / 4 > mid ? n / 4 - mid : 0])
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
                ans = low;
            }
            System.out.println(ans);
        }
    }
}
