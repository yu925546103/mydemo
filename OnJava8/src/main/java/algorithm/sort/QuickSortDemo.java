package algorithm.sort;

/**
 * @Author yujt
 * @Date 2021/11/27 10:53
 * @Version 1.0
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] a = {23, 1, 56, 22, 1, 45, 3, 35, 677};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void quickSort(int[] arr, int left, int right) {
        int center;
        if (left < right) {
            center = partiton(arr, left, right);
            quickSort(arr, left, center - 1);
            quickSort(arr, center + 1, right);
        }
    }


    static int partiton(int[] arr, int left, int right) {
        int pivot = left;
        int i = left + 1;
        int j = right;
        int temp;
        while (true) {
            while (i <= j && arr[i] <= arr[pivot]) {
                i++;
            }
            while (i <= j && arr[j] >= arr[pivot]) {
                j--;
            }
            if (i >= j) {
                break;
            }
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }

}
