import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int[][] ans = new int[x][y];

            for (int j = 0; j < y; j += 2)
                ans[0][j] = 1;
            if (x > 2) {
                for (int j = 0; j < y; j += 2)
                    ans[x - 1][j] = 1;
                for (int i = 2; i < x - 2; i += 2) {
                    ans[i][0] = 1;
                    ans[i][y - 1] = 1;
                }
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++)
                    sb.append(ans[i][j]);
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}