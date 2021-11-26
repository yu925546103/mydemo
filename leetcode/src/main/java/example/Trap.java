package example;

import org.junit.Test;

/**
 * 给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。
 *
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的直方图，在这种情况下，可以接 6 个单位的水（蓝色部分表示水）。
 */

/**
 * 动态规划的方法
 */
public class Trap {
    public int trap(int[] height) {
        int MAX_NUM = height.length;
        if (MAX_NUM < 1) {
            return 0;
        }
        //从左构建最大数组
        int[] leftMax = new int[MAX_NUM];
        leftMax[0] = height[0];
        for (int i = 1; i < MAX_NUM; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        //从右构建最大数组
        int[] rightMax = new int[MAX_NUM];
        rightMax[MAX_NUM - 1] = height[MAX_NUM - 1];
        for (int i = MAX_NUM - 2; i > 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        //计算结果
        int result = 0;
        for (int i = 0; i < MAX_NUM; i++) {
            result += Math.min(rightMax[i], leftMax[i]) - height[i];
        }
        return result;
    }

    @Test
    public void Test() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
