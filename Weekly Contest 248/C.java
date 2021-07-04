public class C {
    public int countGoodNumbers(long n) {
        long ans = 1;
        long MOD = (long) Math.pow(10, 9) + 7;
        long x = (n + 1) / 2, y = n / 2;
        long a = 5, b = y == 0 ? 1 : 4;
        while (x > 1) {
            if (x % 2 == 1) {
                ans *= a;
                x--;
            } else {
                a *= a;
                x /= 2;
            }
            a %= MOD;
            ans %= MOD;
        }
        while (y > 1) {
            if (y % 2 == 1) {
                ans *= b;
                y--;
            } else {
                b *= b;
                y /= 2;
            }
            b %= MOD;
            ans %= MOD;
        }
        ans *= (a * b) % MOD;

        return (int) (ans % MOD);
    }
}