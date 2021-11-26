package collections;

/**
 * @Author yujt
 * @Date 2021/11/26 14:45
 * @Version 1.0
 */
public class CycleQueue {
    private String[] items;

    private int head = 0;

    private int tail = 0;

    private int n = 0;

    public CycleQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    public void add(String element) {
        // 最后一个存储空间存在浪费
        if ((tail + 1) % n == head) {
            System.out.println("队列已满" + element + "插入失败");
            return;
        }
        items[tail] = element;
        tail = (tail + 1) % n;
        System.out.println(element + "插入成功");
    }

    public String get() {
        if (tail == head) {
            System.out.println("队列已空");
            return null;
        }
        String item = items[head];
        head = (head + 1) % n;
        return item;
    }

}

