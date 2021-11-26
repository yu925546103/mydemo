package medium;

import org.junit.Test;

public class merge {
    @Test
    public void Test() {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1,1,nums2,1);
        for (int i=0; i < nums1.length;i++) {
            System.out.println(nums1[i]);
        }
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if  (n == 0) {
//            return;
//        }
//        int point1 = m - 1;
//        int point2 = n - 1;
//        int temp = 0;
//        while (point1 >= 0 && point2 >= 0) {
//            if (nums2[point2] < nums1[point1]) {
//                temp = nums2[point2];
//                nums2[point2] = nums1[point1];
//                nums1[point1] = temp;
//                point1--;
//            } else {
//                point2--;
//            }
//        }
//        for (int i=0;i<n;i++) {
//            nums1[m+i] = nums2[i];
//        }
//
//    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int[] nums3 = new int[nums1.length];
        int point1 = 0;
        int point2 = 0;
        while (point1 < m || point2 < n) {
            if (point1 == m) {
                nums3[point1+point2] = nums2[point2];
                point2++;
                continue;
            }
            if (point2 == n) {
                nums3[point1+point2] = nums1[point1];
                point1++;
                continue;
            }
            if (nums1[point1] <= nums2[point2]) {
                nums3[point1+point2] = nums1[point1];
                point1++;
            } else {
                nums3[point1+point2] = nums2[point2];
                point2++;
            }
        }
        for (int i=0;i<nums3.length;i++) {
            nums1[i] = nums3[i];
        }
    }
}
