public class C {
    public int colorTheGrid(int m, int n) {
        long ans = 3;
        long MOD = (long) Math.pow(10, 9) + 7;
        int p = m * n;
        for (int i = 1; i < p; i++) {
            ans *= 2;
            ans %= MOD;
        }
        return (int) ans;
    }
}