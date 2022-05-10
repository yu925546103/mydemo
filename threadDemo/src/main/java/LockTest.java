import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author yujt
 * @Date 2022/1/19 09:52
 * @Version 1.0
 */
public class LockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        try {
            Thread thread = new Thread(() -> {
                lock.lock();
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
                System.out.println("A1");
            });
            Thread thread1 = new Thread(() -> {
                lock.lock();
                System.out.println("A2");
                lock.unlock();
            });
            thread.start();
            thread1.start();
        } catch (Exception e) {

        } finally {

        }

    }
}
