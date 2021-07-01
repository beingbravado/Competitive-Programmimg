import java.util.Arrays;

public class A {
    public int maxProductDifference(int[] nums) {
        Integer[] a = new Integer[nums.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[i];
        }
        Arrays.sort(a);
        return a[a.length - 1] * a[a.length - 2] - a[0] * a[1];
    }
}
