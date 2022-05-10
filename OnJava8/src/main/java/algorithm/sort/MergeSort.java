package algorithm.sort;

/**
 * @Author yujt
 * @Date 2022/3/30 10:20
 * @Version 1.0
 */
public class MergeSort extends Sort {
    public static void main(String[] args) {
        Integer[] a = {1, 6, 3, 7, 23, 723, 1312, 12312, 56};
        sort(a, 0, a.length - 1);
        export(a);
    }

    public static void sort(Comparable[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (right + left) / 2;
        sort(a, left, mid);
        sort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public static void merge(Comparable[] a, int left, int mid, int right) {
        Comparable[] temp = new Comparable[right - left + 1];
        int i = left;
        int j = mid + 1;
        int index = 0;
        // 左右两边数组中进行比较
        while (i <= mid && j <= right) {
            temp[index++] = less(a[i], a[j]) ? a[i++] : a[j++];
        }
        // 左边多余的元素
        while (i <= mid) {
            temp[index++] = a[i++];
        }
        // 右边多余的元素
        while (j <= right) {
            temp[index++] = a[j++];
        }
        // 临时数组拷贝到原数组
        for (int k = 0; k < temp.length; k++) {
            a[left + k] = temp[k];
        }
    }

}
