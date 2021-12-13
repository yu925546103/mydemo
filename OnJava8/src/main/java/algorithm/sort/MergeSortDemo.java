package algorithm.sort;

/**
 * @Author yujt
 * @Date 2021/11/26 16:50
 * @Version 1.0
 */
public class MergeSortDemo {

    public static void main(String[] args) {
        int[] a = {23, 1, 56, 22, 1, 45, 3, 35, 677};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = 0;
        int p1 = low;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= high) {
            temp[i++] = a[p1] < a[p2] ? a[p1++] : a[p2++];
        }
        while (p1 <= mid) {
            temp[i++] = a[p1++];
        }
        while (p2 <= high) {
            temp[i++] = a[p2++];
        }
        // 复制给原数组
        for (int j = 0; j < temp.length; j++) {
            a[low + j] = temp[j];
        }
    }

    static void sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }
}


