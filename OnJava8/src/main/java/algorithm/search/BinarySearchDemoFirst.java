package algorithm.search;

/**
 * @Author yujt
 * @Date 2021/11/28 17:05
 * @Version 1.0
 * @Description 二分查找支持找到第一个重复
 */
public class BinarySearchDemoFirst {

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 21, 67, 67, 67, 87, 122, 352, 2422, 4363, 23421};
        System.out.println(binarySearch(a, 67));
    }


    static int binarySearch(int[] a, int value) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo < hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (value <= a[mid]) {
                hi = --mid;
            } else {
                lo = ++mid;
            }
        }

        if (lo < a.length && a[lo] == value) {
            return lo;
        }

        return -1;
    }
}
