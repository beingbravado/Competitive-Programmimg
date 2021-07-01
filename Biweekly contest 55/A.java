import java.util.Arrays;

public class A {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0, index = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                index = i;
            }
        }
        if (count > 1)
            return false;
        else if (count == 0)
            return true;
        else {
            if (nums[index] > (index > 1 ? nums[index - 2] : 0))
                return true;
            if (nums[index - 1] < (index < nums.length - 1 ? nums[index + 1] : Integer.MAX_VALUE))
                return true;
        }
        return false;
    }
}
