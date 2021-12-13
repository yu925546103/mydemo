package algorithm.search;

/**
 * @Author yujt
 * @Date 2021/11/28 16:23
 * @Version 1.0
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 21, 34, 55, 67, 87, 122, 352, 2422, 4363, 23421};
        System.out.println(binarySearch(a, 0, a.length - 1, 2422));
    }

    static int binarySearch(int[] a, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (right + left) / 2;
        if (a[mid] == target) {
            return mid;
        } else if (target > a[mid]) {
            return binarySearch(a, mid + 1, right, target);
        } else if (target < a[mid]) {
            return binarySearch(a, left, mid - 1, target);
        } else {
            return -1;
        }
    }
}
