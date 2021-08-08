import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);

            int ans = 0;
            Queue<Integer> pq = new PriorityQueue<>();
            while (n-- > 0) {
                String[] s = br.readLine().trim().split(" ");
                int m = Integer.parseInt(s[0]);
                int[] a = new int[m];
                for (int i = 0; i < m; i++)
                    a[i] = Integer.parseInt(s[i + 1]);

                int k = 1, max = -1;
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 1; i < m; i++, k++) {
                    if (a[i] < a[i - 1]) {
                        max = Math.max(max, k);
                        list.add(k);
                        pq.add(k);
                        k = 0;
                    }
                }
                list.add(k);
                pq.add(k);
                max = Math.max(max, k);
                for (int x : list) {
                    // System.out.println("--" + x);
                    if (x == max) {
                        max = -1;
                        continue;
                    }
                    ans += x;
                }
            }
            // System.out.println(ans + "***");
            // for (int x : pq)
            // System.out.print(x + " ");
            // System.out.println();
            while (pq.size() > 1) {
                if (pq.size() == 2) {
                    ans += pq.poll();
                    ans += pq.poll();
                } else {
                    int x = pq.poll();
                    x += pq.poll();
                    ans += x;
                    pq.add(x);
                }
            }
            System.out.println(ans);
        }
        System.out.println(sb);
    }
}
