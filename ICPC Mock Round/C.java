import java.io.*;

public class C {
    public static double solution;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);

            int[] a = new int[n];
            String[] s1 = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s1[i]);

            sb.append(findXorSum(a, n) + "\n");
        }
        System.out.println(sb);
    }

    static int findXorSum(int a[], int n) {
        int sum = 0;
        int mul = 1;

        for (int i = 0; i < 30; i++) {
            int even = 0;
            boolean odd = false;

            for (int j = 0; j < n; j++) {
                if ((a[j] & (1 << i)) > 0)
                    odd = (!odd);
                if (odd)
                    even++;
            }
            for (int j = 0; j < n; j++) {
                sum += (mul * even);

                if ((a[j] & (1 << i)) > 0)
                    even = (n - j - even);
            }
            mul *= 2;
        }

        return sum;
    }
}
