package difficult;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。
 *
 *
 *
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的直方图，在这种情况下，可以接 6 个单位的水（蓝色部分表示水）。
 *
 */
public class Solution2 {
    Deque<Integer> posLeft = new ArrayDeque<Integer>();
    Deque<Integer> posRight = new ArrayDeque<Integer>();

    @Test
    public void test() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }
        int high = height[0];
        int highPos = 0;
        int result;
        //找到最高点
        for (int i = 1;i<height.length;i++) {
            if (high < height[i]) {
                highPos = i;
                high = height[i];
            }
        }
        if (highPos == 0) {
            posRight.add(highPos);
            searchRight(highPos+1,height.length-1,height);
            return calculateRight(height);
        }
        if (highPos == height.length-1) {
            posLeft.add(highPos);
            searchLeft(0,highPos-1,height);
            return calculateLeft(height);
        }
        else {
            posLeft.add(highPos);
            searchLeft(0,highPos-1,height);
            posRight.add(highPos);
            searchRight(highPos+1,height.length-1,height);
            result = calculateLeft(height)+calculateRight(height);
        }
        return result;
    }

    public void searchLeft(int left,int right,int[] a) {
        if (right < left) {
            return;
        }
        int leftPos = right;
        int leftValue = a[right];
        for (int i = left;i <= right;i++) {
            if (leftValue <= a[i]) {
                leftPos = i;
                leftValue = a[i];
            }
        }
        posLeft.add(leftPos);
        searchLeft(left,leftPos-1,a);
    }

    public void  searchRight(int left,int right,int[] a) {
        if (left > right) {
            return;
        }
        int rightPos = left;
        int rightValue = a[left];
        for (int i = left;i <= right;i++) {
            if (rightValue < a[i]) {
                rightPos = i;
                rightValue = a[i];
            }
        }
        posRight.add(rightPos);
        searchRight(rightPos+1,right,a);
    }

    public int calculateLeft(int[] a) {
        int result = 0;
        int left = posLeft.pop();
        int right = -1;
        if (!posLeft.isEmpty()) {
             right = posLeft.pop();
        }
        if (right == -1) {
            return 0;
        }
        for (int i = right + 1; i < left; i++) {
            result = result + a[right] - a[i];
        }
        while (!posLeft.isEmpty()) {
            left = right;
            right = posLeft.pop();
            for (int i = right + 1; i < left; i++) {
                result = result + a[right] - a[i];
            }
        }
        return result;
    }

    public int calculateRight(int[] a) {
        int result = 0;
        int left = posRight.pop();
        int right = -1;
        if (!posRight.isEmpty()) {
            right = posRight.pop();
        }
        if (right == -1) {
            return 0;
        }
        for (int i = right - 1; i > left; i--) {
            result = result + a[right] - a[i];
        }
        while (!posRight.isEmpty()) {
            left = right;
            right = posRight.pop();
            for (int i = right - 1; i > left; i--) {
                result = result + a[right] - a[i];
            }
        }
        return result;
    }

}
