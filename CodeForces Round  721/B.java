import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = scan.nextInt();
        // int t= Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = scan.nextInt();
            char[] a = scan.next().toCharArray();

            int x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == '0') {
                    if (a[i] == a[n - i - 1])
                        x++;
                    else
                        y++;
                }
            }
            // System.out.println(x + " " + y);

            if (y > 0) {
                System.out.println("ALICE");
            } else {
                if (x % 2 == 0) {
                    System.out.println("BOB");
                } else {
                    x--;
                    if (x == 0) {
                        System.out.println("BOB");
                    } else {
                        System.out.println("ALICE");
                    }
                }
            }

            // System.out.println();
        }
        scan.close();
    }
}
