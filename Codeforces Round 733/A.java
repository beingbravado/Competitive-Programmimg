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
            String n = br.readLine();
            int ans = 0;
            for (int i = 0; i < n.length(); i++) {
                ans = Math.max(ans, Integer.parseInt(n.substring(i, i + 1)));
            }
            System.out.println(ans);
        }
        System.out.println(sb);
    }
}
