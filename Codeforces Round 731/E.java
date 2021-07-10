import java.io.*;
import java.util.Arrays;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String space = br.readLine();
            String[] s0 = br.readLine().split(" ");
            int n = Integer.parseInt(s0[0]);
            int k = Integer.parseInt(s0[1]);
            int[] a = new int[k];
            int[] time = new int[k];
            long[] ans = new long[n];

            String[] s1 = br.readLine().split(" ");
            String[] s2 = br.readLine().split(" ");
            for (int i = 0; i < k; i++) {
                a[i] = Integer.parseInt(s1[i]);
                time[i] = Integer.parseInt(s2[i]);
            }

            Arrays.fill(ans, Integer.MAX_VALUE);
            for (int j = 0; j < k; j++) {
                ans[a[j] - 1] = time[j];
            }
            for (int i = 1; i < n; i++) {
                ans[i] = Math.min(ans[i], ans[i - 1] + 1);
            }
            for (int i = n - 2; i >= 0; i--) {
                ans[i] = Math.min(ans[i], ans[i + 1] + 1);
            }

            for (int i = 0; i < n; i++)
                sb.append(ans[i] + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
