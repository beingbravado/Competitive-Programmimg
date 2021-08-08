import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] tt = br.readLine().trim().split(" ");
        int t = Integer.parseInt(tt[0]);
        while (t-- > 0) {
            String s = br.readLine();

            boolean flag = false, ans = false;
            for (char c : s.toCharArray()) {
                if (c == 'U' && flag)
                    ans = true;
                else if (c == 'M')
                    flag = true;
            }
            System.out.println(ans ? "Yes" : "No");
        }
        System.out.println(sb);
    }
}
