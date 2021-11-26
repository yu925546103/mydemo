import difficult.Solution2;
import org.junit.Test;

public class TestDemo {
   @Test
    public void test() {
       Solution2 solution2 = new Solution2();
       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(solution2.trap(height));
   }
}
