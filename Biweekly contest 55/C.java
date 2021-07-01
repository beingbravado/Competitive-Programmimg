public class C {
    public long maxAlternatingSum(int[] nums) {
        long count = 0L;
        boolean inc = true;
        for (int i = 0; i < nums.length; i++) {
            if (inc) {
                if (nums[i] >= (i > 0 ? nums[i - 1] : 0) && nums[i] >= (i < nums.length - 1 ? nums[i + 1] : 0)) {
                    count += nums[i];
                    inc = false;
                }
            } else {
                if (nums[i] <= (i > 0 ? nums[i - 1] : 0) && nums[i] <= (i < nums.length - 1 ? nums[i + 1] : 0)) {
                    count -= nums[i];
                    inc = true;
                }
            }
        }
        return count;
    }
}
