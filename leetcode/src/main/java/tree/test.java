package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yujt
 * @Date 2021/9/18 21:57
 * @Version 1.0
 */
public class test {
    static class A {
        private String a1;
        private String a2;
        private String a3;

        public String getA1() {
            return a1;
        }

        public void setA1(String a1) {
            this.a1 = a1;
        }

        public String getA2() {
            return a2;
        }

        public void setA2(String a2) {
            this.a2 = a2;
        }

        public String getA3() {
            return a3;
        }

        public void setA3(String a3) {
            this.a3 = a3;
        }
    }

    public static void main(String[] args) {
        List<Long> longList = new ArrayList<Long>();
        longList.add(200L);
        for (int i=0; i<longList.size();i++) {
            System.out.println(longList.get(i));
        }
    }

}
