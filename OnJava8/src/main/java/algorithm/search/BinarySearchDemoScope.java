package algorithm.search;

/**
 * @Author yujt
 * @Date 2021/11/28 17:21
 * @Version 1.0
 * @description 查找第一个大于给定值的
 */
public class BinarySearchDemoScope {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 21, 67, 67, 67, 87, 122, 352, 2422, 4363, 23421};
        System.out.println(binarySearch(a, 0));
    }

    static int binarySearch(int[] a, int value) {
        int lo = 0;
        int hi = a.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + ((hi - lo) >> 1);
            if (a[mid] <= value) {
                lo = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] < value) {
                    return mid;
                }
                hi = --mid;
            }
        }
        return -1;
    }
}
