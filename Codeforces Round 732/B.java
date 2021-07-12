import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine().trim();
            boolean ans = false;
            int l = 0, r = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    l = i - 1;
                    r = i + 1;
                    ans = true;
                    break;
                }
            }
            if (ans) {
                char x = 'b';
                int count = s.length();
                while ((l >= 0 || r < 26) && count-- > 1) {
                    if (l >= 0 && s.charAt(l) == x) {
                        x++;
                        l--;
                        continue;
                    } else if (r < s.length() && s.charAt(r) == x) {
                        x++;
                        r++;
                        continue;
                    } else {
                        ans = false;
                        break;
                    }
                }
            }
            System.out.println(ans ? "YES" : "NO");
        }
    }
}