import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().trim().split(" ");
            long a = Integer.parseInt(s1[0]);
            long b = Integer.parseInt(s1[1]);
            long c = Integer.parseInt(s1[2]);

            boolean ans = false;
            long sum = a + b + c;
            if (sum % 4 == 0 && a >= sum / 4 && b >= sum / 4 && c >= sum / 4)
                ans = true;
            sb.append(ans ? "YES\n" : "NO\n");
        }
        System.out.println(sb);
    }

    static int findXorSum(int arr[], int n) {
        int sum = 0;
        int mul = 1;

        for (int i = 0; i < 30; i++) {
            int c_odd = 0;
            boolean odd = false;

            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) > 0)
                    odd = (!odd);
                if (odd)
                    c_odd++;
            }
            for (int j = 0; j < n; j++) {
                sum += (mul * c_odd);

                if ((arr[j] & (1 << i)) > 0)
                    c_odd = (n - j - c_odd);
            }
            mul *= 2;
        }

        return sum;
    }
}