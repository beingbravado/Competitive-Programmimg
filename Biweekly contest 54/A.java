public class A {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] a = new boolean[right - left + 1];
        for (int i = 0; i < ranges.length; i++) {
            for (int j = ranges[i][0]; j <= ranges[i][1]; j++) {
                if (j < left) {
                    j = left - 1;
                    continue;
                }
                if (j > right)
                    break;
                a[j - left] = true;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i])
                return false;
        }
        return true;
    }
}
