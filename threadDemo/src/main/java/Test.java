/**
 * @Author yujt
 * @Date 2021/12/20 14:10
 * @Version 1.0
 */
public class Test {

    static int a = 0;
    static int b = 0;
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) throws InterruptedException {
        int index = 0;
        while (true) {
            a = 0;
            b = 0;
            x = 0;
            y = 0;

            Thread C = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    x = b;
                }
            });

            Thread D = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = a;
                }
            });

            C.start();
            D.start();
            C.join();
            D.join();
            if (x == 0 && y == 0) {
                System.out.println("��" + index + "�Σ�" + x + "," + y);
                break;
            }
            index++;
            if (index % 100000 == 0) {
                System.out.println(index);
            }
        }
    }
}

