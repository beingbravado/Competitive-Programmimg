import java.io.*;
import java.util.HashSet;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            long[] a = new long[n];
            String[] s1 = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s1[i]);

            boolean ans = false;
            HashSet<Long> set = new HashSet<>();
            set.add(0L);
            for (int i = 0; i < n; i++) {
                if (set.contains(a[i]))
                    ans = true;
                set.add(a[i]);
            }

            if (!ans) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j)
                            continue;
                        if (set.contains(a[i] - a[j])) {
                            ans = true;
                            break;
                        } else
                            set.add(a[i] - a[j]);
                    }
                    if (ans)
                        break;
                }
            }

            System.out.println(ans ? "YES" : "NO");
        }
    }
}
