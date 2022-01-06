package medium;

/**
 * @Author yujt
 * @Date 2021/12/14 13:54
 * @Version 1.0
 */
public class SearchRangeDemo {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int[] res = searchRange(nums, 1);
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public static int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
