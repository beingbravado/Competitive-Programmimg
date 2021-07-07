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
            String[] s0 = br.readLine().trim().split(" ");
            long a = Long.parseLong(s0[0]);
            long b = Long.parseLong(s0[1]);
            long ans = Math.abs(a - b);
            if (ans == 0) {
                sb.append(0 + " " + 0 + "\n");
                continue;
            }
            long moves = Math.min(a % ans, ans - a % ans);
            moves = Math.min(moves, Math.min(b % ans, ans - b % ans));
            sb.append(ans + " " + moves + "\n");
        }
        System.out.println(sb);
    }
}
