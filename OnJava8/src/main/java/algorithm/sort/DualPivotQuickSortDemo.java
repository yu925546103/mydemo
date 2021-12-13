package algorithm.sort;

/**
 * @Author yujt
 * @Date 2021/11/28 13:42
 * @Version 1.0
 */
public class DualPivotQuickSortDemo {
    public static void main(String[] args) {
        int[] a = {23, 1, 56, 22, 1, 45, 3, 35, 677};
        dualPivotQuickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void dualPivotQuickSort(int[] a, int left, int right) {
        if (right - left < 1) {
            return;
        }
        int pivot1 = Math.min(a[left], a[right]);
        int pivot2 = Math.max(a[left], a[right]);
        int start = left + 1;
        int end = right - 1;
        int index = start;
        while (index <= end) {
            if (a[index] < pivot1) {
                swap(a, start, index);
                start++;
            } else if (a[index] >= pivot2) {
                while (a[end] > pivot2 && index < end) {
                    end--;
                }
                swap(a, index, end);
                end--;
                if (a[index] < pivot1) {
                    swap(a, start, index);
                    start++;
                }
            }
            index++;
        }
        start--;
        end++;
        a[left] = a[start];
        a[start] = pivot1;
        a[right] = a[end];
        a[end] = pivot2;
        dualPivotQuickSort(a, left, start - 1);
        dualPivotQuickSort(a, start + 1, end - 1);
        dualPivotQuickSort(a, end + 1, right);
    }

    static void swap(int[] a, int b, int c) {
        int temp;
        temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
