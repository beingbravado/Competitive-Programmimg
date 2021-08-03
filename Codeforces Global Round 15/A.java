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
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            Integer[] original = new Integer[n];
            Integer[] changed = new Integer[n];
            for (int i = 0; i < n; i++) {
                original[i] = str.charAt(i) - 'a';
                changed[i] = original[i];
            }
            Arrays.sort(changed);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (changed[i] != original[i])
                    ans++;
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}
