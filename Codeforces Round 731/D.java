import java.io.*;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            int[] b = new int[n];
            int[] ans = new int[n];

            String[] s1 = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s1[i]);

            for (int i = 1; i < n; i++) {
                if ((a[i - 1] & a[i]) == a[i - 1])
                    continue;
                else
                    ans[i] = a[i] ^ (a[i - 1] | a[i]);
            }
            for (int i = 0; i < n; i++)
                b[i] = a[i] ^ ans[i];
            for (int i = 1; i < n; i++) {
                if ((b[i - 1] & b[i]) == b[i - 1])
                    continue;
                else {
                    while ((b[i - 1] & b[i]) != b[i - 1]) {
                        ans[i] += b[i] ^ (b[i - 1] | b[i]);
                        b[i] = a[i] ^ ans[i];
                    }
                }
            }

            for (int i = 0; i < n; i++)
                sb.append(ans[i] + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
