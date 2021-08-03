import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int[][] a = new int[n][5];
            for (int i = 0; i < n; i++) {
                String[] s2 = br.readLine().split(" ");
                for (int j = 0; j < 5; j++)
                    a[i][j] = Integer.parseInt(s2[j]);
            }
            if (n == 1) {
                sb.append(1 + "\n");
                continue;
            }
            int ans = 0;
            for (int i = 1; i < n; i++) {
                int count = 0;
                for (int j = 0; j < 5; j++)
                    if (a[ans][j] < a[i][j])
                        count++;
                if (count < 3)
                    ans = i;
                // System.out.println(ans);
            }
            for (int i = 0; i < n; i++) {
                if (i == ans)
                    continue;
                int count = 0;
                for (int j = 0; j < 5; j++)
                    if (a[ans][j] > a[i][j])
                        count++;
                // System.out.println(count);
                if (count >= 3) {
                    ans = -2;
                    break;
                }
            }
            sb.append((ans + 1) + "\n");
        }
        System.out.println(sb);
    }
}