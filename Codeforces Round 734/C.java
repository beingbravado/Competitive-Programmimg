import java.io.*;

public class C {
    public static double solution;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);

            int[] a = new int[n];
            String[] s1 = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s1[i]);

            boolean ans = true;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    int count = 1;
                    int l = i - 1, r = i + 1;
                    while (l >= 0 && a[l] >= a[l + 1]) {
                        count++;
                        l--;
                    }
                    while (r < n && a[r] < a[r - 1]) {
                        count++;
                        r++;
                    }
                    l++;
                    r--;
                    if (count % 2 == 0) {
                        ans = false;
                        break;
                    }
                    i = r;
                    while (l < r) {
                        int temp = a[l];
                        a[l] = a[r];
                        a[r] = temp;
                        r--;
                        l++;
                    }
                }
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}
