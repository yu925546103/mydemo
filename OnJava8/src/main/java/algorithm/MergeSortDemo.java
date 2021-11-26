package algorithm;

/**
 * @Author yujt
 * @Date 2021/11/26 16:50
 * @Version 1.0
 */
public class MergeSortDemo {

    void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[];
        int medium = a.length / 2;
        mergeSort(a, 0, medium);
        mergeSort(a, medium + 1, a.length - 1);
    }

    void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }
}


