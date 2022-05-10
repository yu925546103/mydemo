import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author yujt
 * @Date 2022/1/19 10:44
 * @Version 1.0
 */
public class ConcurrentDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(32);
        int i = 0;
        Thread thread0 = new Thread(() -> {
            for (; ; ) {
                i++;
                String KEY = "s" + i;
                concurrentHashMap.put(KEY, String.valueOf(i));
            }
        });

    }
}
