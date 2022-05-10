package algorithm.sort;

/**
 * @Author yujt
 * @Date 2022/3/27 21:02
 * @Version 1.0
 */
public class ShellSort extends Sort {
    public static void main(String[] args) {
        Integer[] a = {1, 6, 3, 7, 23, 723, 1312, 12312, 56};
        sort(a);
        export(a);
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        // 根据数组的大小，动态选择生成h序列
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            // h序列排序
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            // 逐渐减少h值，最后h=1，进行完整排序；h减少的过程，数组趋于宏观有序
            h = h / 3;
        }
    }

}
