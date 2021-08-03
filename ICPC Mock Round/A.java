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
            int c1 = n / 3, c2 = n / 3;
            if (n % 3 == 1)
                c1++;
            else if (n % 3 == 2)
                c2++;
            sb.append(c1 + " " + c2 + "\n");
        }
        System.out.println(sb);
    }
}
