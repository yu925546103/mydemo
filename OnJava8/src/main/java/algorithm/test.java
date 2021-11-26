package algorithm;

import java.util.HashMap;

/**
 * @Author yujt
 * @Date 2021/11/26 15:22
 * @Version 1.0
 */
public class test {
    private static HashMap<Integer, Long> resolvedMap = new HashMap(128);

    public static void main(String[] args) {
        System.out.println(f(100));
    }

    static long f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (resolvedMap.get(n) != null) {
            return resolvedMap.get(n);
        }
        long result =  f(n - 1) + f(n - 2);
        resolvedMap.put(n, result);
        return result;
    }
}
