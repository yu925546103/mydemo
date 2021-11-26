package medium;

import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesDemo {

    @Test
    public void test() {
        int[] nums = {1,1,1,1,1,2,2,2,3};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
