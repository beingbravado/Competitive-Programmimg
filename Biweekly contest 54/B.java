public class B {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int i = 0; i < chalk.length; i++)
            sum += chalk[i];
        k %= sum;
        for (int x = 0; x < chalk.length; x++) {
            if (k < chalk[x])
                return x;
            else
                k -= chalk[x];
        }
        return -1;
    }
}