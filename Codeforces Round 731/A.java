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
            String s0 = br.readLine();
            String[] s1 = br.readLine().trim().split(" ");
            int ax = Integer.parseInt(s1[0]);
            int ay = Integer.parseInt(s1[1]);
            String[] s2 = br.readLine().trim().split(" ");
            int bx = Integer.parseInt(s2[0]);
            int by = Integer.parseInt(s2[1]);
            String[] s3 = br.readLine().trim().split(" ");
            int fx = Integer.parseInt(s3[0]);
            int fy = Integer.parseInt(s3[1]);

            int ans = Math.abs(ax - bx) + Math.abs(ay - by);
            if (ax == bx && fx == ax && ((fy > ay && fy < by) || (fy < ay && fy > by)))
                ans += 2;
            if (ay == by && fy == ay && ((fx > ax && fx < bx) || (fx < ax && fx > bx)))
                ans += 2;
            if (ay == by && ax == bx)
                ans = 0;
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}
