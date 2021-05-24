import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            Integer[] x = new Integer[n];
            for (int i = 0; i < n; i++)
                x[i] = scan.nextInt();
            Arrays.sort(x);
            long dif = Integer.MAX_VALUE;
            int ans = 1;
            for (int i = 1; i < n; i++) {
                if (x[i] > 0) {
                    if (x[i] > dif || dif == Integer.MAX_VALUE || x[i] == x[i - 1]) {
                        break;
                    } else {
                        ans++;
                    }
                } else {
                    ans++;
                    dif = Math.min(dif, x[i] - x[i - 1]);
                }
            }
            System.out.println(ans);
        }
        scan.close();
    }
}
