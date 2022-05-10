package algorithm.sort;

/**
 * @Author yujt
 * @Date 2022/3/27 21:06
 * @Version 1.0
 */
public class Sort {
    static protected boolean less(Comparable a1, Comparable a2) {
        return a1.compareTo(a2) < 0;
    }

    static protected void exch(Comparable[] a, int pos1, int pos2) {
        Comparable<?> temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
    }

    static protected void export(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
