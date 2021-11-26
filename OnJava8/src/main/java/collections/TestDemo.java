package collections;

/**
 * @Author yujt
 * @Date 2021/11/26 14:53
 * @Version 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        CycleQueue cycleQueue = new CycleQueue(6);
        cycleQueue.add("a");
        cycleQueue.add("b");
        System.out.println(cycleQueue.get());
        cycleQueue.add("c");
        cycleQueue.add("d");
        cycleQueue.add("e");
        cycleQueue.add("f");
        cycleQueue.add("g");
    }
}
