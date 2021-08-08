import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            long n = Long.parseLong(s[0]);
            long x = Long.parseLong(s[1]);

            long ans = 0;
            while (n > x) {
                ans++;
                long num = findCount(n);
                n -= num;
            }
            if (n > 0)
                ans++;
            if (n < 0)
                ans = -1;
            System.out.println(ans);
        }
        System.out.println(sb);
    }

    static long findCount(long n) {
        long num = 2;
        for (int i = 0; i <= 32; i++) {
            long x = num * 4;
            if (x > n)
                return num;
            num = x;
        }

        return -1;
    }
}
