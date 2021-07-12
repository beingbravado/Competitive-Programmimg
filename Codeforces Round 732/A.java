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
            String[] s1 = br.readLine().trim().split(" ");
            String[] s2 = br.readLine().trim().split(" ");
            int[] a = new int[n];
            int[] b = new int[n];
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s1[i]);
                b[i] = Integer.parseInt(s2[i]);
                sum1 += a[i];
                sum2 += b[i];
            }
            if (sum1 != sum2) {
                sb.append("-1\n");
            } else {
                int operation = 0;
                StringBuffer ans = new StringBuffer();
                for (int i = 0; i < n; i++) {
                    while (a[i] > b[i]) {
                        for (int j = 0; j < n; j++) {
                            while (a[j] < b[j]) {
                                a[i]--;
                                a[j]++;
                                operation++;
                                ans.append((i + 1) + " " + (j + 1) + "\n");
                                if (a[i] <= b[i])
                                    break;
                            }
                            if (a[i] <= b[i])
                                break;
                        }
                    }
                }
                sb.append(operation + "\n");
                if (operation > 0)
                    sb.append(ans);
            }
        }
        System.out.println(sb);
    }
}
