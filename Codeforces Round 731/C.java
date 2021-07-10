import java.io.*;

public class C {
    public static double solution;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String space = br.readLine();
            String[] s = br.readLine().trim().split(" ");
            int k = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            int m = Integer.parseInt(s[2]);

            int[] a = new int[n];
            int[] b = new int[m];
            int[] ans = new int[n + m];

            String[] s1 = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s1[i]);
            String[] s2 = br.readLine().split(" ");
            for (int i = 0; i < m; i++)
                b[i] = Integer.parseInt(s2[i]);
            int x = 0, y = 0;
            int index = 0, count = n + m;
            boolean con = true;
            while ((x < n || y < m) && count-- > 0 && con) {
                if (x < n && a[x] == 0) {
                    k++;
                    ans[index] = a[x];
                    x++;
                    index++;
                } else if (x < n && a[x] > 0 && a[x] <= k) {
                    ans[index] = a[x];
                    index++;
                    x++;
                } else if (y < m && b[y] == 0) {
                    k++;
                    ans[index] = b[y];
                    y++;
                    index++;
                } else if (y < m && b[y] > 0 && b[y] <= k) {
                    ans[index] = b[y];
                    index++;
                    y++;
                } else
                    con = false;
            }
            if (con) {
                for (int i = 0; i < n + m; i++)
                    System.out.print(ans[i] + " ");
                System.out.println();
            } else
                System.out.println(-1);
        }
    }
}
