import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = scan.nextInt();
        String[] s = br.readLine().trim().split(" ");
        int MOD = (int) Math.pow(10, 9) + 7;
        int t = Integer.parseInt(s[0]);
        while (t-- > 0) {
            String[] s0 = br.readLine().trim().split(" ");
            long n = Long.parseLong(s0[0]);
            long ans = 2 * n + n / 2;
            long num = 3, divisor = 6;
            while (n / divisor >= 1) {
                ans += n / divisor;
                // System.out.println("* -> " + n / divisor);
                ans %= MOD;
                num++;
                divisor *= num;
                long first = num - 1;
                while (first >= 2) {
                    if (num % first == 0) {
                        divisor /= first;
                        break;
                    }
                    first--;
                }
            }
            System.out.println(ans);
        }
    }
}
